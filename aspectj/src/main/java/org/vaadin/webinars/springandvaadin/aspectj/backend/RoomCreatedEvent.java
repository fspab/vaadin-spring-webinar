/*
 * Copyright 2014 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.webinars.springandvaadin.aspectj.backend;

import org.springframework.context.ApplicationEvent;

/**
 * @author petter@vaadin.com
 */
public class RoomCreatedEvent extends ApplicationEvent {

    private final String room;

    public RoomCreatedEvent(Object source, String room) {
        super(source);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }
}
