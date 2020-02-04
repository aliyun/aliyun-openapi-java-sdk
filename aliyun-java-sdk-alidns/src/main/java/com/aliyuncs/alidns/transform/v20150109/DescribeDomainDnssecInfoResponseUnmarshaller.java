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

package com.aliyuncs.alidns.transform.v20150109;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainDnssecInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainDnssecInfoResponseUnmarshaller {

	public static DescribeDomainDnssecInfoResponse unmarshall(DescribeDomainDnssecInfoResponse describeDomainDnssecInfoResponse, UnmarshallerContext _ctx) {
		
		describeDomainDnssecInfoResponse.setRequestId(_ctx.stringValue("DescribeDomainDnssecInfoResponse.RequestId"));
		describeDomainDnssecInfoResponse.setDomainName(_ctx.stringValue("DescribeDomainDnssecInfoResponse.DomainName"));
		describeDomainDnssecInfoResponse.setStatus(_ctx.stringValue("DescribeDomainDnssecInfoResponse.Status"));
		describeDomainDnssecInfoResponse.setDsRecord(_ctx.stringValue("DescribeDomainDnssecInfoResponse.DsRecord"));
		describeDomainDnssecInfoResponse.setDigest(_ctx.stringValue("DescribeDomainDnssecInfoResponse.Digest"));
		describeDomainDnssecInfoResponse.setDigestType(_ctx.stringValue("DescribeDomainDnssecInfoResponse.DigestType"));
		describeDomainDnssecInfoResponse.setAlgorithm(_ctx.stringValue("DescribeDomainDnssecInfoResponse.Algorithm"));
		describeDomainDnssecInfoResponse.setPublicKey(_ctx.stringValue("DescribeDomainDnssecInfoResponse.PublicKey"));
		describeDomainDnssecInfoResponse.setKeyTag(_ctx.stringValue("DescribeDomainDnssecInfoResponse.KeyTag"));
		describeDomainDnssecInfoResponse.setFlags(_ctx.stringValue("DescribeDomainDnssecInfoResponse.Flags"));
	 
	 	return describeDomainDnssecInfoResponse;
	}
}