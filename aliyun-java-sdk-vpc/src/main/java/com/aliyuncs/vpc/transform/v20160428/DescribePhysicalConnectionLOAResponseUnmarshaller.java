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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribePhysicalConnectionLOAResponse;
import com.aliyuncs.vpc.model.v20160428.DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType;
import com.aliyuncs.vpc.model.v20160428.DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePhysicalConnectionLOAResponseUnmarshaller {

	public static DescribePhysicalConnectionLOAResponse unmarshall(DescribePhysicalConnectionLOAResponse describePhysicalConnectionLOAResponse, UnmarshallerContext _ctx) {
		
		describePhysicalConnectionLOAResponse.setRequestId(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.RequestId"));

		PhysicalConnectionLOAType physicalConnectionLOAType = new PhysicalConnectionLOAType();
		physicalConnectionLOAType.setInstanceId(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.InstanceId"));
		physicalConnectionLOAType.setCompanyName(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.CompanyName"));
		physicalConnectionLOAType.setCompanyLocalizedName(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.CompanyLocalizedName"));
		physicalConnectionLOAType.setLineType(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LineType"));
		physicalConnectionLOAType.setLineCode(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LineCode"));
		physicalConnectionLOAType.setLineLabel(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LineLabel"));
		physicalConnectionLOAType.setConstructionTime(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.ConstructionTime"));
		physicalConnectionLOAType.setStatus(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.Status"));
		physicalConnectionLOAType.setLoaUrl(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LoaUrl"));
		physicalConnectionLOAType.setSI(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.SI"));

		List<PMInfoItem> pMInfo = new ArrayList<PMInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo.Length"); i++) {
			PMInfoItem pMInfoItem = new PMInfoItem();
			pMInfoItem.setPMName(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMName"));
			pMInfoItem.setPMContactInfo(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMContactInfo"));
			pMInfoItem.setPMCertificateType(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMCertificateType"));
			pMInfoItem.setPMCertificateNo(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMCertificateNo"));
			pMInfoItem.setPMGender(_ctx.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMGender"));

			pMInfo.add(pMInfoItem);
		}
		physicalConnectionLOAType.setPMInfo(pMInfo);
		describePhysicalConnectionLOAResponse.setPhysicalConnectionLOAType(physicalConnectionLOAType);
	 
	 	return describePhysicalConnectionLOAResponse;
	}
}