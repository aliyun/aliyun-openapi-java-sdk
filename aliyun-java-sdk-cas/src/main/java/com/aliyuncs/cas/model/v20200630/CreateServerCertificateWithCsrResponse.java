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

package com.aliyuncs.cas.model.v20200630;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200630.CreateServerCertificateWithCsrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateServerCertificateWithCsrResponse extends AcsResponse {

	private String x509Certificate;

	private String certificateChain;

	private String rootX509Certificate;

	private String parentX509Certificate;

	private String identifier;

	private String requestId;

	public String getX509Certificate() {
		return this.x509Certificate;
	}

	public void setX509Certificate(String x509Certificate) {
		this.x509Certificate = x509Certificate;
	}

	public String getCertificateChain() {
		return this.certificateChain;
	}

	public void setCertificateChain(String certificateChain) {
		this.certificateChain = certificateChain;
	}

	public String getRootX509Certificate() {
		return this.rootX509Certificate;
	}

	public void setRootX509Certificate(String rootX509Certificate) {
		this.rootX509Certificate = rootX509Certificate;
	}

	public String getParentX509Certificate() {
		return this.parentX509Certificate;
	}

	public void setParentX509Certificate(String parentX509Certificate) {
		this.parentX509Certificate = parentX509Certificate;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateServerCertificateWithCsrResponse getInstance(UnmarshallerContext context) {
		return	CreateServerCertificateWithCsrResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
