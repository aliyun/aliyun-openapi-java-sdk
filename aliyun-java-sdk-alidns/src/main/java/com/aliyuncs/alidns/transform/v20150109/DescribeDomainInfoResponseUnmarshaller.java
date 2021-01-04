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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainInfoResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainInfoResponse.RecordLine;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainInfoResponseUnmarshaller {

	public static DescribeDomainInfoResponse unmarshall(DescribeDomainInfoResponse describeDomainInfoResponse, UnmarshallerContext _ctx) {
		
		describeDomainInfoResponse.setRequestId(_ctx.stringValue("DescribeDomainInfoResponse.RequestId"));
		describeDomainInfoResponse.setDomainId(_ctx.stringValue("DescribeDomainInfoResponse.DomainId"));
		describeDomainInfoResponse.setDomainName(_ctx.stringValue("DescribeDomainInfoResponse.DomainName"));
		describeDomainInfoResponse.setPunyCode(_ctx.stringValue("DescribeDomainInfoResponse.PunyCode"));
		describeDomainInfoResponse.setAliDomain(_ctx.booleanValue("DescribeDomainInfoResponse.AliDomain"));
		describeDomainInfoResponse.setRemark(_ctx.stringValue("DescribeDomainInfoResponse.Remark"));
		describeDomainInfoResponse.setGroupId(_ctx.stringValue("DescribeDomainInfoResponse.GroupId"));
		describeDomainInfoResponse.setGroupName(_ctx.stringValue("DescribeDomainInfoResponse.GroupName"));
		describeDomainInfoResponse.setInstanceId(_ctx.stringValue("DescribeDomainInfoResponse.InstanceId"));
		describeDomainInfoResponse.setVersionCode(_ctx.stringValue("DescribeDomainInfoResponse.VersionCode"));
		describeDomainInfoResponse.setVersionName(_ctx.stringValue("DescribeDomainInfoResponse.VersionName"));
		describeDomainInfoResponse.setMinTtl(_ctx.longValue("DescribeDomainInfoResponse.MinTtl"));
		describeDomainInfoResponse.setRecordLineTreeJson(_ctx.stringValue("DescribeDomainInfoResponse.RecordLineTreeJson"));
		describeDomainInfoResponse.setLineType(_ctx.stringValue("DescribeDomainInfoResponse.LineType"));
		describeDomainInfoResponse.setRegionLines(_ctx.booleanValue("DescribeDomainInfoResponse.RegionLines"));
		describeDomainInfoResponse.setInBlackHole(_ctx.booleanValue("DescribeDomainInfoResponse.InBlackHole"));
		describeDomainInfoResponse.setInClean(_ctx.booleanValue("DescribeDomainInfoResponse.InClean"));
		describeDomainInfoResponse.setSlaveDns(_ctx.booleanValue("DescribeDomainInfoResponse.SlaveDns"));
		describeDomainInfoResponse.setResourceGroupId(_ctx.stringValue("DescribeDomainInfoResponse.ResourceGroupId"));
		describeDomainInfoResponse.setCreateTime(_ctx.stringValue("DescribeDomainInfoResponse.CreateTime"));

		List<String> dnsServers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainInfoResponse.DnsServers.Length"); i++) {
			dnsServers.add(_ctx.stringValue("DescribeDomainInfoResponse.DnsServers["+ i +"]"));
		}
		describeDomainInfoResponse.setDnsServers(dnsServers);

		List<String> availableTtls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainInfoResponse.AvailableTtls.Length"); i++) {
			availableTtls.add(_ctx.stringValue("DescribeDomainInfoResponse.AvailableTtls["+ i +"]"));
		}
		describeDomainInfoResponse.setAvailableTtls(availableTtls);

		List<RecordLine> recordLines = new ArrayList<RecordLine>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainInfoResponse.RecordLines.Length"); i++) {
			RecordLine recordLine = new RecordLine();
			recordLine.setLineCode(_ctx.stringValue("DescribeDomainInfoResponse.RecordLines["+ i +"].LineCode"));
			recordLine.setFatherCode(_ctx.stringValue("DescribeDomainInfoResponse.RecordLines["+ i +"].FatherCode"));
			recordLine.setLineName(_ctx.stringValue("DescribeDomainInfoResponse.RecordLines["+ i +"].LineName"));
			recordLine.setLineDisplayName(_ctx.stringValue("DescribeDomainInfoResponse.RecordLines["+ i +"].LineDisplayName"));

			recordLines.add(recordLine);
		}
		describeDomainInfoResponse.setRecordLines(recordLines);
	 
	 	return describeDomainInfoResponse;
	}
}