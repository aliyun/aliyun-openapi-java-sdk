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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDataTrackOrderRequest extends RpcAcsRequest<CreateDataTrackOrderResponse> {
	   

	private Long tid;

	@SerializedName("param")
	private Param param;

	@SerializedName("relatedUserList")
	private List<String> relatedUserList;

	private String comment;
	public CreateDataTrackOrderRequest() {
		super("dms-enterprise", "2018-11-01", "CreateDataTrackOrder", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Param getParam() {
		return this.param;
	}

	public void setParam(Param param) {
		this.param = param;	
		if (param != null) {
			putQueryParameter("Param" , new Gson().toJson(param));
		}	
	}

	public List<String> getRelatedUserList() {
		return this.relatedUserList;
	}

	public void setRelatedUserList(List<String> relatedUserList) {
		this.relatedUserList = relatedUserList;	
		if (relatedUserList != null) {
			putQueryParameter("RelatedUserList" , new Gson().toJson(relatedUserList));
		}	
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public static class Param {

		@SerializedName("JobEndTime")
		private String jobEndTime;

		@SerializedName("TrackTypes")
		private List<String> trackTypes;

		@SerializedName("TableNames")
		private List<String> tableNames;

		@SerializedName("DbId")
		private String dbId;

		@SerializedName("JobStartTime")
		private String jobStartTime;

		public String getJobEndTime() {
			return this.jobEndTime;
		}

		public void setJobEndTime(String jobEndTime) {
			this.jobEndTime = jobEndTime;
		}

		public List<String> getTrackTypes() {
			return this.trackTypes;
		}

		public void setTrackTypes(List<String> trackTypes) {
			this.trackTypes = trackTypes;
		}

		public List<String> getTableNames() {
			return this.tableNames;
		}

		public void setTableNames(List<String> tableNames) {
			this.tableNames = tableNames;
		}

		public String getDbId() {
			return this.dbId;
		}

		public void setDbId(String dbId) {
			this.dbId = dbId;
		}

		public String getJobStartTime() {
			return this.jobStartTime;
		}

		public void setJobStartTime(String jobStartTime) {
			this.jobStartTime = jobStartTime;
		}
	}

	@Override
	public Class<CreateDataTrackOrderResponse> getResponseClass() {
		return CreateDataTrackOrderResponse.class;
	}

}
