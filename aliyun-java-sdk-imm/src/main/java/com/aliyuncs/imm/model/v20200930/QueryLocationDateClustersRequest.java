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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLocationDateClustersRequest extends RpcAcsRequest<QueryLocationDateClustersResponse> {
	   

	private String customLabels;

	private String order;

	private String projectName;

	@SerializedName("locationDateClusterLevels")
	private List<String> locationDateClusterLevels;

	private String sort;

	private Integer maxResults;

	@SerializedName("locationDateClusterEndTimeRange")
	private LocationDateClusterEndTimeRange locationDateClusterEndTimeRange;

	private String title;

	private String nextToken;

	private String datasetName;

	@SerializedName("locationDateClusterStartTimeRange")
	private LocationDateClusterStartTimeRange locationDateClusterStartTimeRange;

	@SerializedName("address")
	private Address address;

	@SerializedName("createTimeRange")
	private CreateTimeRange createTimeRange;

	@SerializedName("updateTimeRange")
	private UpdateTimeRange updateTimeRange;

	private String objectId;
	public QueryLocationDateClustersRequest() {
		super("imm", "2020-09-30", "QueryLocationDateClusters", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCustomLabels() {
		return this.customLabels;
	}

	public void setCustomLabels(String customLabels) {
		this.customLabels = customLabels;
		if(customLabels != null){
			putQueryParameter("CustomLabels", customLabels);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public List<String> getLocationDateClusterLevels() {
		return this.locationDateClusterLevels;
	}

	public void setLocationDateClusterLevels(List<String> locationDateClusterLevels) {
		this.locationDateClusterLevels = locationDateClusterLevels;	
		if (locationDateClusterLevels != null) {
			putQueryParameter("LocationDateClusterLevels" , new Gson().toJson(locationDateClusterLevels));
		}	
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public LocationDateClusterEndTimeRange getLocationDateClusterEndTimeRange() {
		return this.locationDateClusterEndTimeRange;
	}

	public void setLocationDateClusterEndTimeRange(LocationDateClusterEndTimeRange locationDateClusterEndTimeRange) {
		this.locationDateClusterEndTimeRange = locationDateClusterEndTimeRange;	
		if (locationDateClusterEndTimeRange != null) {
			putQueryParameter("LocationDateClusterEndTimeRange" , new Gson().toJson(locationDateClusterEndTimeRange));
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putQueryParameter("DatasetName", datasetName);
		}
	}

	public LocationDateClusterStartTimeRange getLocationDateClusterStartTimeRange() {
		return this.locationDateClusterStartTimeRange;
	}

	public void setLocationDateClusterStartTimeRange(LocationDateClusterStartTimeRange locationDateClusterStartTimeRange) {
		this.locationDateClusterStartTimeRange = locationDateClusterStartTimeRange;	
		if (locationDateClusterStartTimeRange != null) {
			putQueryParameter("LocationDateClusterStartTimeRange" , new Gson().toJson(locationDateClusterStartTimeRange));
		}	
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;	
		if (address != null) {
			putQueryParameter("Address" , new Gson().toJson(address));
		}	
	}

	public CreateTimeRange getCreateTimeRange() {
		return this.createTimeRange;
	}

	public void setCreateTimeRange(CreateTimeRange createTimeRange) {
		this.createTimeRange = createTimeRange;	
		if (createTimeRange != null) {
			putQueryParameter("CreateTimeRange" , new Gson().toJson(createTimeRange));
		}	
	}

	public UpdateTimeRange getUpdateTimeRange() {
		return this.updateTimeRange;
	}

	public void setUpdateTimeRange(UpdateTimeRange updateTimeRange) {
		this.updateTimeRange = updateTimeRange;	
		if (updateTimeRange != null) {
			putQueryParameter("UpdateTimeRange" , new Gson().toJson(updateTimeRange));
		}	
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
		if(objectId != null){
			putQueryParameter("ObjectId", objectId);
		}
	}

	public static class LocationDateClusterEndTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	public static class LocationDateClusterStartTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	public static class Address {

		@SerializedName("Country")
		private String country;

		@SerializedName("Province")
		private String province;

		@SerializedName("City")
		private String city;

		@SerializedName("District")
		private String district;

		@SerializedName("Language")
		private String language;

		@SerializedName("AddressLine")
		private String addressLine;

		@SerializedName("Township")
		private String township;

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDistrict() {
			return this.district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public String getAddressLine() {
			return this.addressLine;
		}

		public void setAddressLine(String addressLine) {
			this.addressLine = addressLine;
		}

		public String getTownship() {
			return this.township;
		}

		public void setTownship(String township) {
			this.township = township;
		}
	}

	public static class CreateTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	public static class UpdateTimeRange {

		@SerializedName("Start")
		private String start;

		@SerializedName("End")
		private String end;

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
	}

	@Override
	public Class<QueryLocationDateClustersResponse> getResponseClass() {
		return QueryLocationDateClustersResponse.class;
	}

}
