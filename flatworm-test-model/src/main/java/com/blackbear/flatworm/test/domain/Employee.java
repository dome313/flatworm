/*
 * Flatworm - A Java Flat File Importer/Exporter Copyright (C) 2004 James M. Turner.
 * Extended by James Lawrence 2005
 * Extended by Josh Brackett in 2011 and 2012
 * Extended by Alan Henson in 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.blackbear.flatworm.test.domain;

import lombok.Data;

/**
 * Created by IntelliJ IDEA. User: james Date: Sep 18, 2003 Time: 2:56:46 AM To change this template use Options | File Templates.
 */
@Data
public class Employee {
    private String firstName;

    private String lastName;

    private String ssn;

    private double salary;

    private String gender;

    private String misc;

    public String toString() {
        return super.toString() + "[" + this.lastName + ", " + this.firstName + ", " + this.ssn + ", "
                + this.gender + ", " + this.salary + ", " + this.misc + "]";
    }

    public boolean validate() {
        return true;
    }
}
