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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.EvaluateSupportByokShowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EvaluateSupportByokShowResponse extends AcsResponse {

	private String requestId;

	private Integer supportByokShow;

	private String supportByokZone;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getSupportByokShow() {
		return this.supportByokShow;
	}

	public void setSupportByokShow(Integer supportByokShow) {
		this.supportByokShow = supportByokShow;
	}

	public String getSupportByokZone() {
		return this.supportByokZone;
	}

	public void setSupportByokZone(String supportByokZone) {
		this.supportByokZone = supportByokZone;
	}

	@Override
	public EvaluateSupportByokShowResponse getInstance(UnmarshallerContext context) {
		return	EvaluateSupportByokShowResponseUnmarshaller.unmarshall(this, context);
	}
}
