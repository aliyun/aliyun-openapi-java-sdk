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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForSaveArtExtensionRequest extends RpcAcsRequest<SaveSingleTaskForSaveArtExtensionResponse> {
	   

	private String subject;

	private String title;

	private String dateOrPeriod;

	private String reference;

	private String features;

	private String inscriptionsAndMarkings;

	private String objectType;

	private String lang;

	private String domainName;

	private String maker;

	private String materialsAndTechniques;

	private String dimensions;
	public SaveSingleTaskForSaveArtExtensionRequest() {
		super("Domain", "2018-01-29", "SaveSingleTaskForSaveArtExtension");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		if(subject != null){
			putQueryParameter("Subject", subject);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public String getDateOrPeriod() {
		return this.dateOrPeriod;
	}

	public void setDateOrPeriod(String dateOrPeriod) {
		this.dateOrPeriod = dateOrPeriod;
		if(dateOrPeriod != null){
			putQueryParameter("DateOrPeriod", dateOrPeriod);
		}
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
		if(reference != null){
			putQueryParameter("Reference", reference);
		}
	}

	public String getFeatures() {
		return this.features;
	}

	public void setFeatures(String features) {
		this.features = features;
		if(features != null){
			putQueryParameter("Features", features);
		}
	}

	public String getInscriptionsAndMarkings() {
		return this.inscriptionsAndMarkings;
	}

	public void setInscriptionsAndMarkings(String inscriptionsAndMarkings) {
		this.inscriptionsAndMarkings = inscriptionsAndMarkings;
		if(inscriptionsAndMarkings != null){
			putQueryParameter("InscriptionsAndMarkings", inscriptionsAndMarkings);
		}
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
		if(objectType != null){
			putQueryParameter("ObjectType", objectType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getMaker() {
		return this.maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
		if(maker != null){
			putQueryParameter("Maker", maker);
		}
	}

	public String getMaterialsAndTechniques() {
		return this.materialsAndTechniques;
	}

	public void setMaterialsAndTechniques(String materialsAndTechniques) {
		this.materialsAndTechniques = materialsAndTechniques;
		if(materialsAndTechniques != null){
			putQueryParameter("MaterialsAndTechniques", materialsAndTechniques);
		}
	}

	public String getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
		if(dimensions != null){
			putQueryParameter("Dimensions", dimensions);
		}
	}

	@Override
	public Class<SaveSingleTaskForSaveArtExtensionResponse> getResponseClass() {
		return SaveSingleTaskForSaveArtExtensionResponse.class;
	}

}
