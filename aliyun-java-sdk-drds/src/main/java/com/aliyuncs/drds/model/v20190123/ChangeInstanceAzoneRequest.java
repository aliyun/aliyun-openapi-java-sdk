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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ChangeInstanceAzoneRequest extends RpcAcsRequest<ChangeInstanceAzoneResponse> {
	
	public ChangeInstanceAzoneRequest() {
		super("Drds", "2019-01-23", "ChangeInstanceAzone", "drds");
	}

	private String originAzoneId;

	private String targetAzoneId;

	private String drdsRegionId;

	private String drdsInstanceId;

	public String getOriginAzoneId() {
		return this.originAzoneId;
	}

	public void setOriginAzoneId(String originAzoneId) {
		this.originAzoneId = originAzoneId;
		if(originAzoneId != null){
			putQueryParameter("OriginAzoneId", originAzoneId);
		}
	}

	public String getTargetAzoneId() {
		return this.targetAzoneId;
	}

	public void setTargetAzoneId(String targetAzoneId) {
		this.targetAzoneId = targetAzoneId;
		if(targetAzoneId != null){
			putQueryParameter("TargetAzoneId", targetAzoneId);
		}
	}

	public String getDrdsRegionId() {
		return this.drdsRegionId;
	}

	public void setDrdsRegionId(String drdsRegionId) {
		this.drdsRegionId = drdsRegionId;
		if(drdsRegionId != null){
			putQueryParameter("DrdsRegionId", drdsRegionId);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	@Override
	public Class<ChangeInstanceAzoneResponse> getResponseClass() {
		return ChangeInstanceAzoneResponse.class;
	}

}
