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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetPrometheusInstanceResponse;
import com.aliyuncs.arms.model.v20190808.GetPrometheusInstanceResponse.Data;
import com.aliyuncs.arms.model.v20190808.GetPrometheusInstanceResponse.Data.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrometheusInstanceResponseUnmarshaller {

	public static GetPrometheusInstanceResponse unmarshall(GetPrometheusInstanceResponse getPrometheusInstanceResponse, UnmarshallerContext _ctx) {
		
		getPrometheusInstanceResponse.setRequestId(_ctx.stringValue("GetPrometheusInstanceResponse.RequestId"));
		getPrometheusInstanceResponse.setMessage(_ctx.stringValue("GetPrometheusInstanceResponse.Message"));
		getPrometheusInstanceResponse.setCode(_ctx.integerValue("GetPrometheusInstanceResponse.Code"));

		Data data = new Data();
		data.setClusterId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.ClusterId"));
		data.setRegionId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.RegionId"));
		data.setUserId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.UserId"));
		data.setClusterName(_ctx.stringValue("GetPrometheusInstanceResponse.Data.ClusterName"));
		data.setClusterType(_ctx.stringValue("GetPrometheusInstanceResponse.Data.ClusterType"));
		data.setVpcId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.VpcId"));
		data.setVSwitchId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.VSwitchId"));
		data.setSecurityGroupId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.SecurityGroupId"));
		data.setSubClustersJson(_ctx.stringValue("GetPrometheusInstanceResponse.Data.SubClustersJson"));
		data.setPaymentType(_ctx.stringValue("GetPrometheusInstanceResponse.Data.PaymentType"));
		data.setGrafanaInstanceId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.GrafanaInstanceId"));
		data.setResourceGroupId(_ctx.stringValue("GetPrometheusInstanceResponse.Data.ResourceGroupId"));
		data.setResourceType(_ctx.stringValue("GetPrometheusInstanceResponse.Data.ResourceType"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetPrometheusInstanceResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("GetPrometheusInstanceResponse.Data.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("GetPrometheusInstanceResponse.Data.Tags["+ i +"].TagValue"));

			tags.add(tag);
		}
		data.setTags(tags);
		getPrometheusInstanceResponse.setData(data);
	 
	 	return getPrometheusInstanceResponse;
	}
}