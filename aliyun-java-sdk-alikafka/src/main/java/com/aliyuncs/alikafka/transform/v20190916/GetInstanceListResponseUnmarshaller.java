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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse;
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO;
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO.TagVO;
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO.UpgradeServiceDetailInfoVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceListResponseUnmarshaller {

	public static GetInstanceListResponse unmarshall(GetInstanceListResponse getInstanceListResponse, UnmarshallerContext _ctx) {
		
		getInstanceListResponse.setRequestId(_ctx.stringValue("GetInstanceListResponse.RequestId"));
		getInstanceListResponse.setSuccess(_ctx.booleanValue("GetInstanceListResponse.Success"));
		getInstanceListResponse.setCode(_ctx.integerValue("GetInstanceListResponse.Code"));
		getInstanceListResponse.setMessage(_ctx.stringValue("GetInstanceListResponse.Message"));

		List<InstanceVO> instanceList = new ArrayList<InstanceVO>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceListResponse.InstanceList.Length"); i++) {
			InstanceVO instanceVO = new InstanceVO();
			instanceVO.setInstanceId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].InstanceId"));
			instanceVO.setRegionId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].RegionId"));
			instanceVO.setServiceStatus(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ServiceStatus"));
			instanceVO.setVpcId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VpcId"));
			instanceVO.setVSwitchId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VSwitchId"));
			instanceVO.setEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].EndPoint"));
			instanceVO.setCreateTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].CreateTime"));
			instanceVO.setExpiredTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].ExpiredTime"));
			instanceVO.setDeployType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DeployType"));
			instanceVO.setSslEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SslEndPoint"));
			instanceVO.setName(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Name"));
			instanceVO.setIoMax(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].IoMax"));
			instanceVO.setEipMax(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].EipMax"));
			instanceVO.setDiskType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DiskType"));
			instanceVO.setDiskSize(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DiskSize"));
			instanceVO.setMsgRetain(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].MsgRetain"));
			instanceVO.setTopicNumLimit(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].TopicNumLimit"));
			instanceVO.setZoneId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].ZoneId"));
			instanceVO.setPaidType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].PaidType"));
			instanceVO.setSpecType(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SpecType"));
			instanceVO.setSecurityGroup(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SecurityGroup"));

			List<UpgradeServiceDetailInfoVO> upgradeServiceDetailInfo = new ArrayList<UpgradeServiceDetailInfoVO>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceListResponse.InstanceList["+ i +"].UpgradeServiceDetailInfo.Length"); j++) {
				UpgradeServiceDetailInfoVO upgradeServiceDetailInfoVO = new UpgradeServiceDetailInfoVO();
				upgradeServiceDetailInfoVO.setCurrent2OpenSourceVersion(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].UpgradeServiceDetailInfo["+ j +"].Current2OpenSourceVersion"));

				upgradeServiceDetailInfo.add(upgradeServiceDetailInfoVO);
			}
			instanceVO.setUpgradeServiceDetailInfo(upgradeServiceDetailInfo);

			List<TagVO> tags = new ArrayList<TagVO>();
			for (int j = 0; j < _ctx.lengthValue("GetInstanceListResponse.InstanceList["+ i +"].Tags.Length"); j++) {
				TagVO tagVO = new TagVO();
				tagVO.setKey(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Tags["+ j +"].Key"));
				tagVO.setValue(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagVO);
			}
			instanceVO.setTags(tags);

			instanceList.add(instanceVO);
		}
		getInstanceListResponse.setInstanceList(instanceList);
	 
	 	return getInstanceListResponse;
	}
}