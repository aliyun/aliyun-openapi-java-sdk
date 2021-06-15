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

package com.aliyuncs.actiontrail.model.v20200706;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.actiontrail.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTrailRequest extends RpcAcsRequest<UpdateTrailResponse> {
	   

	private String slsProjectArn;

	private String slsWriteRoleArn;

	private String ossKeyPrefix;

	private String ossWriteRoleArn;

	private String eventRW;

	private String name;

	private String ossBucketName;

	private String trailRegion;
	public UpdateTrailRequest() {
		super("Actiontrail", "2020-07-06", "UpdateTrail", "actiontrail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSlsProjectArn() {
		return this.slsProjectArn;
	}

	public void setSlsProjectArn(String slsProjectArn) {
		this.slsProjectArn = slsProjectArn;
		if(slsProjectArn != null){
			putQueryParameter("SlsProjectArn", slsProjectArn);
		}
	}

	public String getSlsWriteRoleArn() {
		return this.slsWriteRoleArn;
	}

	public void setSlsWriteRoleArn(String slsWriteRoleArn) {
		this.slsWriteRoleArn = slsWriteRoleArn;
		if(slsWriteRoleArn != null){
			putQueryParameter("SlsWriteRoleArn", slsWriteRoleArn);
		}
	}

	public String getOssKeyPrefix() {
		return this.ossKeyPrefix;
	}

	public void setOssKeyPrefix(String ossKeyPrefix) {
		this.ossKeyPrefix = ossKeyPrefix;
		if(ossKeyPrefix != null){
			putQueryParameter("OssKeyPrefix", ossKeyPrefix);
		}
	}

	public String getOssWriteRoleArn() {
		return this.ossWriteRoleArn;
	}

	public void setOssWriteRoleArn(String ossWriteRoleArn) {
		this.ossWriteRoleArn = ossWriteRoleArn;
		if(ossWriteRoleArn != null){
			putQueryParameter("OssWriteRoleArn", ossWriteRoleArn);
		}
	}

	public String getEventRW() {
		return this.eventRW;
	}

	public void setEventRW(String eventRW) {
		this.eventRW = eventRW;
		if(eventRW != null){
			putQueryParameter("EventRW", eventRW);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
		if(ossBucketName != null){
			putQueryParameter("OssBucketName", ossBucketName);
		}
	}

	public String getTrailRegion() {
		return this.trailRegion;
	}

	public void setTrailRegion(String trailRegion) {
		this.trailRegion = trailRegion;
		if(trailRegion != null){
			putQueryParameter("TrailRegion", trailRegion);
		}
	}

	@Override
	public Class<UpdateTrailResponse> getResponseClass() {
		return UpdateTrailResponse.class;
	}

}
