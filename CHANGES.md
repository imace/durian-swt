# DurianSwt releases

### Version 2.1.0 - TBD ([javadoc](http://diffplug.github.io/durian-swt/javadoc/snapshot/), [snapshot](https://oss.sonatype.org/content/repositories/snapshots/com/diffplug/durian/durian-swt/))

### Version 2.0.0 - July 13th 2016 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/2.0.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/2.0.0/view))

* Introduced the `SwtThread` annotation to mark that a method is only safe to use from an SWT thread.
* Added `SwtExec.swtOnly()` as a high-performance, non-thread-safe version of `SwtExec.immediate()` (thanks to David Karnok).
* Renamed `Shells.openOnAndBlock()` to `Shells.openOnBlocking()`.
* `SwtScheduler` now honors the `Scheduler/Worker` contracts (thanks to David Karnok).
* `ColumnFormat` and `ColumnViewerFormat` now expose all their data through getters.
* Fallout from 2.0 bump of durian-rx.

### Version 1.7.0 - April 6th 2016 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.7.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.7.0/view))

* Upgraded Eclipse/SWT dependencies from Luna SR2 to Mars.2 (4.4.2 to 4.5.2).
* Changed `SwtDebug` event names to their 4.5-based names.
* `InteractiveTest` can now pass/fail itself automatically, for self-testing gui tests.
* Added `SwtRx.combo()` methods for reactive control of combo boxes.
* Added `SwtMisc.requestLayout()`, which is backported from Eclipse Neon.  It will be deprecated when Neon comes out.

### Version 1.6.0 - February 9th 2016 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.6.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.6.0/view))

* Ditched Guava for DurianGuava.

### Version 1.5.1 - December 30th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.5.1/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.5.1/view))

* Fixed a bug in `OS.calculateNative` on linux x86 systems that report their `os.arch` as `i386`.

### Version 1.5.0 - December 11th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.5.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.5.0/view))

* Added `Actions.setCallback`, which allows behavior based on the actual IAction which ends up being created.
* Added `SwtMisc.copyEvent()`.
* Added `SwtMisc.withGcRun` and `SwtMisc.withGcCompute`, which allows quick access to a GC for e.g. computing the size of some text.

### Version 1.4.0 - November 18th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.4.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.4.0/view))

* `SwtExec.Guarded::subscribe` now supports `CompletionStage` and `CompletableFuture`, in support of improvements made to DurianRx 1.2.0.
* Added `SwtMisc.setFlag()`.
* Added `JFaceRx`, which exposes JFace properties as RxJava observables.

### Version 1.3.0 - October 19th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.3.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.3.0/view))

* Changed OSGi metadata Bundle-SymbolicName to `com.diffplug.durian.swt`.
* OSGi metadata is now auto-generated using bnd.
* Added `ColumnViewerFormat.ColumnBuilder::setFinalSetup()` which allows us to get the `ViewerColumn` object and setup something such as a `CellEditor` on it.
* `ColumnViewerFormat` no longer requires a `LabelProvider`, since we might set that stuff up in `setFinalSetup()`.
* Fixed a bug in `Shells` which caused windows to always open on the primary monitor.
* `Actions` is now based on `runWithEvent()` rather than `run()`.  This allows implementors to get the `Event` which is causing the action to fire, which can allow more detailed actions to be taken.

### Version 1.2.0 - September 14th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.2.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.2.0/view))

* Major improvement to the `CoatMux` API.
* Added `ColorPool.getSystemColor(int systemColor)` so that ColorPool can be your one-stop-shop for getting colors.
* Added some methods to `SwtMisc`:
	* `Shell rootShell(Control control)`
	* `void forEachDeep(Composite root, Consumer<Control> ctlSetter)`
	* `void setForegroundDeep(Composite root, Color foreground)`
	* `void setBackgroundDeep(Composite root, Color background)`
	* `Rectangle globalBounds(Control control)`
	* `Rectangle toDisplay(Control control, Rectangle rect)`
	* `Optional<Monitor> monitorFor(Point p)`
* Fixed `SwtMisc.setEnabledDeep()` - it now skips `Composite`s which haven't been subclassed.
* Fixed `SwtRx.toggle()` now works with radio buttons.
* Fixed `Shells` so that the dialogs it creates don't automatically close on escape, and so that they are better about opening on-screen.

### Version 1.1.1 - July 27th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.1.1/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.1.1/view))

* Gah! MANIFEST.MF still had -SNAPSHOT version.  Fixed now.  Would be really nice if we could get MANIFEST.MF generation working.

### Version 1.1 - July 26th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.1/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.1/view))

* Fixed a linux-specific bug in `Shells.openOnActive()`.
* Fixed an NPE in `Shells.openOnActive()`.
* Made `InteractiveTest.testShellWithoutHandle()` a little more forgiving.

### Version 1.0 - May 13th 2015 ([javadoc](http://diffplug.github.io/durian-swt/javadoc/1.0/), [jcenter](https://bintray.com/diffplug/opensource/durian-swt/1.0/view))

* First stable release.
