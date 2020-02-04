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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDomainDnssecInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainDnssecInfoResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String status;

	private String dsRecord;

	private String digest;

	private String digestType;

	private String algorithm;

	private String publicKey;

	private String keyTag;

	private String flags;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDsRecord() {
		return this.dsRecord;
	}

	public void setDsRecord(String dsRecord) {
		this.dsRecord = dsRecord;
	}

	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getDigestType() {
		return this.digestType;
	}

	public void setDigestType(String digestType) {
		this.digestType = digestType;
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getPublicKey() {
		return this.publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getKeyTag() {
		return this.keyTag;
	}

	public void setKeyTag(String keyTag) {
		this.keyTag = keyTag;
	}

	public String getFlags() {
		return this.flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	@Override
	public DescribeDomainDnssecInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainDnssecInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
