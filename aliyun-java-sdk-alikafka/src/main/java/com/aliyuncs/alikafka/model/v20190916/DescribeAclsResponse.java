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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.DescribeAclsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAclsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private List<KafkaAclVO> kafkaAclList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<KafkaAclVO> getKafkaAclList() {
		return this.kafkaAclList;
	}

	public void setKafkaAclList(List<KafkaAclVO> kafkaAclList) {
		this.kafkaAclList = kafkaAclList;
	}

	public static class KafkaAclVO {

		private String username;

		private String aclResourceType;

		private String aclResourceName;

		private String aclResourcePatternType;

		private String host;

		private String aclOperationType;

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getAclResourceType() {
			return this.aclResourceType;
		}

		public void setAclResourceType(String aclResourceType) {
			this.aclResourceType = aclResourceType;
		}

		public String getAclResourceName() {
			return this.aclResourceName;
		}

		public void setAclResourceName(String aclResourceName) {
			this.aclResourceName = aclResourceName;
		}

		public String getAclResourcePatternType() {
			return this.aclResourcePatternType;
		}

		public void setAclResourcePatternType(String aclResourcePatternType) {
			this.aclResourcePatternType = aclResourcePatternType;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getAclOperationType() {
			return this.aclOperationType;
		}

		public void setAclOperationType(String aclOperationType) {
			this.aclOperationType = aclOperationType;
		}
	}

	@Override
	public DescribeAclsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAclsResponseUnmarshaller.unmarshall(this, context);
	}
}
