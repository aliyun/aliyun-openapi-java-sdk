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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryArtExtensionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryArtExtensionResponse extends AcsResponse {

	private String objectType;

	private String materialsAndTechniques;

	private String inscriptionsAndMarkings;

	private String requestId;

	private String reference;

	private String dateOrPeriod;

	private String dimensions;

	private String title;

	private String features;

	private String subject;

	private String maker;

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

	public String getInscriptionsAndMarkings() {
		return this.inscriptionsAndMarkings;
	}

	public void setInscriptionsAndMarkings(String inscriptionsAndMarkings) {
		this.inscriptionsAndMarkings = inscriptionsAndMarkings;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDateOrPeriod() {
		return this.dateOrPeriod;
	}

	public void setDateOrPeriod(String dateOrPeriod) {
		this.dateOrPeriod = dateOrPeriod;
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

	public String getFeatures() {
		return this.features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMaker() {
		return this.maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
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
