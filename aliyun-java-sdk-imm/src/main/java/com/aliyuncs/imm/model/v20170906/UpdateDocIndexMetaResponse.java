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

package com.aliyuncs.imm.model.v20170906;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.UpdateDocIndexMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateDocIndexMetaResponse extends AcsResponse {

	private String requestId;

	private String indexCreatedTime;

	private String indexModifiedTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIndexCreatedTime() {
		return this.indexCreatedTime;
	}

	public void setIndexCreatedTime(String indexCreatedTime) {
		this.indexCreatedTime = indexCreatedTime;
	}

	public String getIndexModifiedTime() {
		return this.indexModifiedTime;
	}

	public void setIndexModifiedTime(String indexModifiedTime) {
		this.indexModifiedTime = indexModifiedTime;
	}

	@Override
	public UpdateDocIndexMetaResponse getInstance(UnmarshallerContext context) {
		return	UpdateDocIndexMetaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
