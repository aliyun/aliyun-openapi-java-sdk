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

package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.SetAlbumCoverResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetAlbumCoverResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizAction() {
		return this.action;
	}

	public void setBizAction(String action) {
		this.action = action;
	}

	/**
	 * @deprecated use getBizAction instead of this.
	 */
	@Deprecated
	public String getAction() {
		return this.action;
	}

	/**
	 * @deprecated use setBizAction instead of this.
	 */
	@Deprecated
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public SetAlbumCoverResponse getInstance(UnmarshallerContext context) {
		return	SetAlbumCoverResponseUnmarshaller.unmarshall(this, context);
	}
}
