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
import com.aliyuncs.ecs.transform.v20140526.CreateKeyPairResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateKeyPairResponse extends AcsResponse {

	private String requestId;

	private String keyPairId;

	private String keyPairName;

	private String keyPairFingerPrint;

	private String privateKeyBody;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getKeyPairId() {
		return this.keyPairId;
	}

	public void setKeyPairId(String keyPairId) {
		this.keyPairId = keyPairId;
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
	}

	public String getKeyPairFingerPrint() {
		return this.keyPairFingerPrint;
	}

	public void setKeyPairFingerPrint(String keyPairFingerPrint) {
		this.keyPairFingerPrint = keyPairFingerPrint;
	}

	public String getPrivateKeyBody() {
		return this.privateKeyBody;
	}

	public void setPrivateKeyBody(String privateKeyBody) {
		this.privateKeyBody = privateKeyBody;
	}

	@Override
	public CreateKeyPairResponse getInstance(UnmarshallerContext context) {
		return	CreateKeyPairResponseUnmarshaller.unmarshall(this, context);
	}
}
