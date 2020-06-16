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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeEnsNetLevelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsNetLevelResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private List<EnsNetLevel> ensNetLevels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<EnsNetLevel> getEnsNetLevels() {
		return this.ensNetLevels;
	}

	public void setEnsNetLevels(List<EnsNetLevel> ensNetLevels) {
		this.ensNetLevels = ensNetLevels;
	}

	public static class EnsNetLevel {

		private String ensNetLevelCode;

		public String getEnsNetLevelCode() {
			return this.ensNetLevelCode;
		}

		public void setEnsNetLevelCode(String ensNetLevelCode) {
			this.ensNetLevelCode = ensNetLevelCode;
		}
	}

	@Override
	public DescribeEnsNetLevelResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsNetLevelResponseUnmarshaller.unmarshall(this, context);
	}
}
