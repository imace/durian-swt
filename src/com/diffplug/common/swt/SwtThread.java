/*
 * Copyright 2016 DiffPlug
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diffplug.common.swt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks that the given code should only be called
 * from an SWT thread.
 *
 * When annotated on a method or constructor, this
 * indicates that all of its methods should only be
 * called from the SWT thread.
 *
 * When annotated on a class, indicates that all
 * of its methods should only be called from the
 * SWT thread  
 *
 * When annotated on a parameter or field, it
 * must be either an {@link rx.Observable},
 * {@link com.diffplug.common.rx.IObservable}, or a
 * {@link java.util.concurrent.CompletionStage}, and
 * it indicates that the given code should only be
 * set and listened to from SWT.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.PARAMETER, ElementType.FIELD})
public @interface SwtThread {}
