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

package com.aliyuncs.actiontrail.model.v20171204;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateTrailRequest extends RpcAcsRequest<UpdateTrailResponse> {
	
	public UpdateTrailRequest() {
		super("Actiontrail", "2017-12-04", "UpdateTrail");
	}

	private String slsProjectArn;

	private String slsWriteRoleArn;

	private String roleName;

	private String name;

	private String ossBucketName;

	private String ossKeyPrefix;

	private String eventRW;

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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
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

	public String getOssKeyPrefix() {
		return this.ossKeyPrefix;
	}

	public void setOssKeyPrefix(String ossKeyPrefix) {
		this.ossKeyPrefix = ossKeyPrefix;
		if(ossKeyPrefix != null){
			putQueryParameter("OssKeyPrefix", ossKeyPrefix);
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

	@Override
	public Class<UpdateTrailResponse> getResponseClass() {
		return UpdateTrailResponse.class;
	}

}
