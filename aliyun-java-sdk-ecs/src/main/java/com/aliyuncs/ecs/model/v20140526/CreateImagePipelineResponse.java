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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.CreateImagePipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateImagePipelineResponse extends AcsResponse {

	private String requestId;

	private String imagePipelineId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImagePipelineId() {
		return this.imagePipelineId;
	}

	public void setImagePipelineId(String imagePipelineId) {
		this.imagePipelineId = imagePipelineId;
	}

	@Override
	public CreateImagePipelineResponse getInstance(UnmarshallerContext context) {
		return	CreateImagePipelineResponseUnmarshaller.unmarshall(this, context);
	}
}
