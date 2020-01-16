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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeRedisLogConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRedisLogConfigResponse extends AcsResponse {

	private String requestId;

	private Integer isEtlMetaExist;

	private Integer isUserProjectLogstoreExist;

	private Integer userProjectName;

	private String userLogstoreName;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getIsEtlMetaExist() {
		return this.isEtlMetaExist;
	}

	public void setIsEtlMetaExist(Integer isEtlMetaExist) {
		this.isEtlMetaExist = isEtlMetaExist;
	}

	public Integer getIsUserProjectLogstoreExist() {
		return this.isUserProjectLogstoreExist;
	}

	public void setIsUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
		this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
	}

	public Integer getUserProjectName() {
		return this.userProjectName;
	}

	public void setUserProjectName(Integer userProjectName) {
		this.userProjectName = userProjectName;
	}

	public String getUserLogstoreName() {
		return this.userLogstoreName;
	}

	public void setUserLogstoreName(String userLogstoreName) {
		this.userLogstoreName = userLogstoreName;
	}

	@Override
	public DescribeRedisLogConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeRedisLogConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
