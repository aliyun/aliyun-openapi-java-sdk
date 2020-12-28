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

package com.aliyuncs.nlp_automl.model.v20190701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlp_automl.transform.v20190701.GetPredictDocResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPredictDocResponse extends AcsResponse {

	private String requestId;

	private String resultContent;

	private Integer status;

	private String xLIFFInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getXLIFFInfo() {
		return this.xLIFFInfo;
	}

	public void setXLIFFInfo(String xLIFFInfo) {
		this.xLIFFInfo = xLIFFInfo;
	}

	@Override
	public GetPredictDocResponse getInstance(UnmarshallerContext context) {
		return	GetPredictDocResponseUnmarshaller.unmarshall(this, context);
	}
}
