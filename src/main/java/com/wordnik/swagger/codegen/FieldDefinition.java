/**
 *  Copyright 2011 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wordnik.swagger.codegen;

import java.util.ArrayList;
import java.util.List;

public class FieldDefinition {

	private String returnType;
	
	private String name;
	
	private String initialization;
	
	private List<String> importDefinitions = new ArrayList<String>();

    private String collectionItemType;

    private String collectionItemName;

	public String getReturnType() {
		return returnType;
	}
	
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getInitialization() {
		return initialization;
	}
	
	public void setInitialization(String initialization) {
		this.initialization = initialization;
	}

	public List<String> getImportDefinitions() {
		return importDefinitions;
	}

    public String getNameForMethod() {
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public void setCollectionItemType(String collectionItemType) {
        this.collectionItemType = collectionItemType;
    }

    public String getCollectionItemType() {
        return collectionItemType;
    }

    public String getCollectionItemName() {
        return collectionItemName;
    }

    public void setCollectionItemName(String collectionItemName) {
        this.collectionItemName = collectionItemName;
    }
}
