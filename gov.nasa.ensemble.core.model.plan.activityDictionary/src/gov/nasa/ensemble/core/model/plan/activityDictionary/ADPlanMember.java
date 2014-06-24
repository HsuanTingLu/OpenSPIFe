/*******************************************************************************
 * Copyright 2014 United States Government as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All Rights Reserved.
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
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gov.nasa.ensemble.core.model.plan.activityDictionary;

import gov.nasa.ensemble.core.model.plan.EMember;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AD Plan Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.nasa.ensemble.core.model.plan.activityDictionary.ADPlanMember#getActivityDictionaryVersion <em>Activity Dictionary Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.nasa.ensemble.core.model.plan.activityDictionary.ActivityDictionaryPackage#getADPlanMember()
 * @model
 * @generated
 */
public interface ADPlanMember extends EMember {

	public static final String KEY = "gov.nasa.ensemble.core.model.plan.activity.dictionary.plan";
	
	/**
	 * Returns the value of the '<em><b>Activity Dictionary Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Dictionary Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Dictionary Version</em>' attribute.
	 * @see #setActivityDictionaryVersion(String)
	 * @see gov.nasa.ensemble.core.model.plan.activityDictionary.ActivityDictionaryPackage#getADPlanMember_ActivityDictionaryVersion()
	 * @model annotation="hibernate parameterName='dictionary.activity.version.number'"
	 *        annotation="detail hidden='true'"
	 * @generated
	 */
	String getActivityDictionaryVersion();

	/**
	 * Sets the value of the '{@link gov.nasa.ensemble.core.model.plan.activityDictionary.ADPlanMember#getActivityDictionaryVersion <em>Activity Dictionary Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Dictionary Version</em>' attribute.
	 * @see #getActivityDictionaryVersion()
	 * @generated
	 */
	void setActivityDictionaryVersion(String value);

} // ADPlanMember
