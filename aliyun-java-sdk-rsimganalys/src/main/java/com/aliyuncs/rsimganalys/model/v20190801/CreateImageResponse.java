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

package com.aliyuncs.rsimganalys.model.v20190801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rsimganalys.transform.v20190801.CreateImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateImageResponse extends AcsResponse {

	private String requestId;

	private Integer resultCode;

	private String resultMessage;

	private String imageId;

	private String userResolution;

	private Integer publishStatus;

	private List<Integer> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getUserResolution() {
		return this.userResolution;
	}

	public void setUserResolution(String userResolution) {
		this.userResolution = userResolution;
	}

	public Integer getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}

	public List<Integer> getItems() {
		return this.items;
	}

	public void setItems(List<Integer> items) {
		this.items = items;
	}

	@Override
	public CreateImageResponse getInstance(UnmarshallerContext context) {
		return	CreateImageResponseUnmarshaller.unmarshall(this, context);
	}
}
