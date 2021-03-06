/**
* Copyright 2016 IBM Corp. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/

package com.ibm.watson.self.classifiers;

public interface IClassifier {
	/**
	 * This should return a text name for this classifier
	 * @return
	 */
	public String getClassifierName();
	
	/**
	 * This should return a unique id for the classifier
	 * @return - unique id
	 */
	public String getClassifierId();
	
	/**
	 * This is invoked when this classifier should start
	 * @return - if it started
	 */
	public boolean onStart();
	
	/**
	 * This is invoked when the classifier should stop
	 * @return - if it stopped
	 */
	public boolean onStop();  

}
