/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.QueryArtExtensionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryArtExtensionResponse extends AcsResponse {

	private String requestId;

	private String objectType;

	private String materialsAndTechniques;

	private String dimensions;

	private String title;

	private String dateOrPeriod;

	private String maker;

	private String inscriptionsAndMarkings;

	private String subject;

	private String features;

	private String reference;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getMaterialsAndTechniques() {
		return this.materialsAndTechniques;
	}

	public void setMaterialsAndTechniques(String materialsAndTechniques) {
		this.materialsAndTechniques = materialsAndTechniques;
	}

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDateOrPeriod() {
		return this.dateOrPeriod;
	}

	public void setDateOrPeriod(String dateOrPeriod) {
		this.dateOrPeriod = dateOrPeriod;
	}

	public String getMaker() {
		return this.maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getInscriptionsAndMarkings() {
		return this.inscriptionsAndMarkings;
	}

	public void setInscriptionsAndMarkings(String inscriptionsAndMarkings) {
		this.inscriptionsAndMarkings = inscriptionsAndMarkings;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFeatures() {
		return this.features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public QueryArtExtensionResponse getInstance(UnmarshallerContext context) {
		return	QueryArtExtensionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
