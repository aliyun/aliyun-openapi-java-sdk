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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeVpcHoneyPotListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVpcHoneyPotListResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeVpcHoneyPotListResponse.VpcHoneyPotDTO;
import com.aliyuncs.sas.model.v20181203.DescribeVpcHoneyPotListResponse.VpcHoneyPotDTO.VpcSwitchInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcHoneyPotListResponseUnmarshaller {

	public static DescribeVpcHoneyPotListResponse unmarshall(DescribeVpcHoneyPotListResponse describeVpcHoneyPotListResponse, UnmarshallerContext _ctx) {
		
		describeVpcHoneyPotListResponse.setRequestId(_ctx.stringValue("DescribeVpcHoneyPotListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeVpcHoneyPotListResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeVpcHoneyPotListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeVpcHoneyPotListResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeVpcHoneyPotListResponse.PageInfo.CurrentPage"));
		describeVpcHoneyPotListResponse.setPageInfo(pageInfo);

		List<VpcHoneyPotDTO> vpcHoneyPotDTOList = new ArrayList<VpcHoneyPotDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList.Length"); i++) {
			VpcHoneyPotDTO vpcHoneyPotDTO = new VpcHoneyPotDTO();
			vpcHoneyPotDTO.setVpcId(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcId"));
			vpcHoneyPotDTO.setVpcName(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcName"));
			vpcHoneyPotDTO.setVpcRegionId(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcRegionId"));
			vpcHoneyPotDTO.setCreateTime(_ctx.longValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].CreateTime"));
			vpcHoneyPotDTO.setVpcStatus(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcStatus"));
			vpcHoneyPotDTO.setCidrBlock(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].CidrBlock"));
			vpcHoneyPotDTO.setHoneyPotExistence(_ctx.booleanValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].HoneyPotExistence"));
			vpcHoneyPotDTO.setHoneyPotVpcSwitchId(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].HoneyPotVpcSwitchId"));
			vpcHoneyPotDTO.setHoneyPotInstanceStatus(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].HoneyPotInstanceStatus"));
			vpcHoneyPotDTO.setHoneyPotEniInstanceId(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].HoneyPotEniInstanceId"));
			vpcHoneyPotDTO.setHoneyPotEcsInstanceStatus(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].HoneyPotEcsInstanceStatus"));

			List<VpcSwitchInfo> vpcSwitchIdList = new ArrayList<VpcSwitchInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcSwitchIdList.Length"); j++) {
				VpcSwitchInfo vpcSwitchInfo = new VpcSwitchInfo();
				vpcSwitchInfo.setVpcSwitchId(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcSwitchIdList["+ j +"].VpcSwitchId"));
				vpcSwitchInfo.setVpcSwitchName(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcSwitchIdList["+ j +"].VpcSwitchName"));
				vpcSwitchInfo.setZoneId(_ctx.stringValue("DescribeVpcHoneyPotListResponse.VpcHoneyPotDTOList["+ i +"].VpcSwitchIdList["+ j +"].ZoneId"));

				vpcSwitchIdList.add(vpcSwitchInfo);
			}
			vpcHoneyPotDTO.setVpcSwitchIdList(vpcSwitchIdList);

			vpcHoneyPotDTOList.add(vpcHoneyPotDTO);
		}
		describeVpcHoneyPotListResponse.setVpcHoneyPotDTOList(vpcHoneyPotDTOList);
	 
	 	return describeVpcHoneyPotListResponse;
	}
}