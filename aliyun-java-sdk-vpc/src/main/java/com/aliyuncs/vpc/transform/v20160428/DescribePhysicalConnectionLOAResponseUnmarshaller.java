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

	public static DescribePhysicalConnectionLOAResponse unmarshall(DescribePhysicalConnectionLOAResponse describePhysicalConnectionLOAResponse, UnmarshallerContext context) {
		
		describePhysicalConnectionLOAResponse.setRequestId(context.stringValue("DescribePhysicalConnectionLOAResponse.RequestId"));

		PhysicalConnectionLOAType physicalConnectionLOAType = new PhysicalConnectionLOAType();
		physicalConnectionLOAType.setInstanceId(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.InstanceId"));
		physicalConnectionLOAType.setCompanyName(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.CompanyName"));
		physicalConnectionLOAType.setCompanyLocalizedName(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.CompanyLocalizedName"));
		physicalConnectionLOAType.setLineType(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LineType"));
		physicalConnectionLOAType.setLineCode(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LineCode"));
		physicalConnectionLOAType.setLineLabel(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LineLabel"));
		physicalConnectionLOAType.setConstructionTime(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.ConstructionTime"));
		physicalConnectionLOAType.setStatus(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.Status"));
		physicalConnectionLOAType.setLoaUrl(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.LoaUrl"));
		physicalConnectionLOAType.setSI(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.SI"));

		List<PMInfoItem> pMInfo = new ArrayList<PMInfoItem>();
		for (int i = 0; i < context.lengthValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo.Length"); i++) {
			PMInfoItem pMInfoItem = new PMInfoItem();
			pMInfoItem.setPMName(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMName"));
			pMInfoItem.setPMContactInfo(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMContactInfo"));
			pMInfoItem.setPMCertificateType(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMCertificateType"));
			pMInfoItem.setPMCertificateNo(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMCertificateNo"));
			pMInfoItem.setPMGender(context.stringValue("DescribePhysicalConnectionLOAResponse.PhysicalConnectionLOAType.PMInfo["+ i +"].PMGender"));

			pMInfo.add(pMInfoItem);
		}
		physicalConnectionLOAType.setPMInfo(pMInfo);
		describePhysicalConnectionLOAResponse.setPhysicalConnectionLOAType(physicalConnectionLOAType);
	 
	 	return describePhysicalConnectionLOAResponse;
	}
}