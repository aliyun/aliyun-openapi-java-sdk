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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetProfileListRequest extends RpcAcsRequest<GetProfileListResponse> {
	   

	private List<Object> profileIdList;

	private String corpId;

	private Integer gender;

	private String plateNo;

	private String idNumber;

	private Long pageNumber;

	private String faceImageId;

	private String faceUrl;

	private Long pageSize;

	private List<Object> personIdList;

	private String liveAddress;

	private String isvSubId;

	private String sceneType;

	private String phoneNo;

	private Long catalogId;

	private String name;

	private String bizId;

	private String matchingRateThreshold;
	public GetProfileListRequest() {
		super("Vcs", "2020-05-15", "GetProfileList", "vcs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Object> getProfileIdList() {
		return this.profileIdList;
	}

	public void setProfileIdList(List<Object> profileIdList) {
		this.profileIdList = profileIdList;
		if(profileIdList != null){
			putBodyParameter("ProfileIdList", new Gson().toJson(profileIdList));
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
		if(gender != null){
			putBodyParameter("Gender", gender.toString());
		}
	}

	public String getPlateNo() {
		return this.plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
		if(plateNo != null){
			putBodyParameter("PlateNo", plateNo);
		}
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
		if(idNumber != null){
			putBodyParameter("IdNumber", idNumber);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFaceImageId() {
		return this.faceImageId;
	}

	public void setFaceImageId(String faceImageId) {
		this.faceImageId = faceImageId;
		if(faceImageId != null){
			putBodyParameter("FaceImageId", faceImageId);
		}
	}

	public String getFaceUrl() {
		return this.faceUrl;
	}

	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
		if(faceUrl != null){
			putBodyParameter("FaceUrl", faceUrl);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public List<Object> getPersonIdList() {
		return this.personIdList;
	}

	public void setPersonIdList(List<Object> personIdList) {
		this.personIdList = personIdList;
		if(personIdList != null){
			putBodyParameter("PersonIdList", new Gson().toJson(personIdList));
		}
	}

	public String getLiveAddress() {
		return this.liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
		if(liveAddress != null){
			putBodyParameter("LiveAddress", liveAddress);
		}
	}

	public String getIsvSubId() {
		return this.isvSubId;
	}

	public void setIsvSubId(String isvSubId) {
		this.isvSubId = isvSubId;
		if(isvSubId != null){
			putBodyParameter("IsvSubId", isvSubId);
		}
	}

	public String getSceneType() {
		return this.sceneType;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
		if(sceneType != null){
			putBodyParameter("SceneType", sceneType);
		}
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
		if(phoneNo != null){
			putBodyParameter("PhoneNo", phoneNo);
		}
	}

	public Long getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
		if(catalogId != null){
			putBodyParameter("CatalogId", catalogId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getMatchingRateThreshold() {
		return this.matchingRateThreshold;
	}

	public void setMatchingRateThreshold(String matchingRateThreshold) {
		this.matchingRateThreshold = matchingRateThreshold;
		if(matchingRateThreshold != null){
			putBodyParameter("MatchingRateThreshold", matchingRateThreshold);
		}
	}

	@Override
	public Class<GetProfileListResponse> getResponseClass() {
		return GetProfileListResponse.class;
	}

}
