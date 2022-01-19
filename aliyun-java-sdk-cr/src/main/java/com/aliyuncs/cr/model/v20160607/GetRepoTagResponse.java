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

package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20160607.GetRepoTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepoTagResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String tag;

	private String digest;

	private String imageId;

	private Long imageCreate;

	private Long imageUpdate;

	private Long imageSize;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Long getImageCreate() {
		return this.imageCreate;
	}

	public void setImageCreate(Long imageCreate) {
		this.imageCreate = imageCreate;
	}

	public Long getImageUpdate() {
		return this.imageUpdate;
	}

	public void setImageUpdate(Long imageUpdate) {
		this.imageUpdate = imageUpdate;
	}

	public Long getImageSize() {
		return this.imageSize;
	}

	public void setImageSize(Long imageSize) {
		this.imageSize = imageSize;
	}

	@Override
	public GetRepoTagResponse getInstance(UnmarshallerContext context) {
		return	GetRepoTagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
