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
import com.aliyuncs.alikafka.model.v20190916.GetInstanceListResponse.InstanceVO.UpgradeServiceDetailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceListResponseUnmarshaller {

	public static GetInstanceListResponse unmarshall(GetInstanceListResponse getInstanceListResponse, UnmarshallerContext _ctx) {
		
		getInstanceListResponse.setRequestId(_ctx.stringValue("GetInstanceListResponse.RequestId"));
		getInstanceListResponse.setCode(_ctx.integerValue("GetInstanceListResponse.Code"));
		getInstanceListResponse.setMessage(_ctx.stringValue("GetInstanceListResponse.Message"));
		getInstanceListResponse.setSuccess(_ctx.booleanValue("GetInstanceListResponse.Success"));

		List<InstanceVO> instanceList = new ArrayList<InstanceVO>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceListResponse.InstanceList.Length"); i++) {
			InstanceVO instanceVO = new InstanceVO();
			instanceVO.setVpcId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VpcId"));
			instanceVO.setSpecType(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SpecType"));
			instanceVO.setDeployType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DeployType"));
			instanceVO.setCreateTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].CreateTime"));
			instanceVO.setDiskSize(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DiskSize"));
			instanceVO.setDiskType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DiskType"));
			instanceVO.setSecurityGroup(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SecurityGroup"));
			instanceVO.setSslEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SslEndPoint"));
			instanceVO.setInstanceId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].InstanceId"));
			instanceVO.setAllConfig(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].AllConfig"));
			instanceVO.setServiceStatus(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ServiceStatus"));
			instanceVO.setEipMax(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].EipMax"));
			instanceVO.setRegionId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].RegionId"));
			instanceVO.setMsgRetain(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].MsgRetain"));
			instanceVO.setVSwitchId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VSwitchId"));
			instanceVO.setExpiredTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].ExpiredTime"));
			instanceVO.setTopicNumLimit(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].TopicNumLimit"));
			instanceVO.setZoneId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].ZoneId"));
			instanceVO.setIoMax(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].IoMax"));
			instanceVO.setPaidType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].PaidType"));
			instanceVO.setName(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Name"));
			instanceVO.setEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].EndPoint"));
			instanceVO.setDomainEndpoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].DomainEndpoint"));
			instanceVO.setSslDomainEndpoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SslDomainEndpoint"));
			instanceVO.setSaslDomainEndpoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SaslDomainEndpoint"));
			instanceVO.setResourceGroupId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].ResourceGroupId"));
			instanceVO.setUsedTopicCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].UsedTopicCount"));
			instanceVO.setUsedGroupCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].UsedGroupCount"));
			instanceVO.setUsedPartitionCount(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].UsedPartitionCount"));
			instanceVO.setKmsKeyId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].KmsKeyId"));
			instanceVO.setStandardZoneId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].StandardZoneId"));
			instanceVO.setIoMaxSpec(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].IoMaxSpec"));

			UpgradeServiceDetailInfo upgradeServiceDetailInfo = new UpgradeServiceDetailInfo();
			upgradeServiceDetailInfo.setCurrent2OpenSourceVersion(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].UpgradeServiceDetailInfo.Current2OpenSourceVersion"));
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