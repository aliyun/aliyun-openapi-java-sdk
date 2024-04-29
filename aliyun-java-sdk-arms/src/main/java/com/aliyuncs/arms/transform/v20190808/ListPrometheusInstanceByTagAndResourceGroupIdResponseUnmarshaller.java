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

import com.aliyuncs.arms.model.v20190808.ListPrometheusInstanceByTagAndResourceGroupIdResponse;
import com.aliyuncs.arms.model.v20190808.ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data;
import com.aliyuncs.arms.model.v20190808.ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstancesItem;
import com.aliyuncs.arms.model.v20190808.ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstancesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrometheusInstanceByTagAndResourceGroupIdResponseUnmarshaller {

	public static ListPrometheusInstanceByTagAndResourceGroupIdResponse unmarshall(ListPrometheusInstanceByTagAndResourceGroupIdResponse listPrometheusInstanceByTagAndResourceGroupIdResponse, UnmarshallerContext _ctx) {
		
		listPrometheusInstanceByTagAndResourceGroupIdResponse.setRequestId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.RequestId"));
		listPrometheusInstanceByTagAndResourceGroupIdResponse.setCode(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Code"));
		listPrometheusInstanceByTagAndResourceGroupIdResponse.setMessage(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Message"));

		Data data = new Data();

		List<PrometheusInstancesItem> prometheusInstances = new ArrayList<PrometheusInstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances.Length"); i++) {
			PrometheusInstancesItem prometheusInstancesItem = new PrometheusInstancesItem();
			prometheusInstancesItem.setClusterId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].ClusterId"));
			prometheusInstancesItem.setRegionId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].RegionId"));
			prometheusInstancesItem.setUserId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].UserId"));
			prometheusInstancesItem.setClusterName(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].ClusterName"));
			prometheusInstancesItem.setClusterType(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].ClusterType"));
			prometheusInstancesItem.setVpcId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].VpcId"));
			prometheusInstancesItem.setVSwitchId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].VSwitchId"));
			prometheusInstancesItem.setSecurityGroupId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].SecurityGroupId"));
			prometheusInstancesItem.setSubClustersJson(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].SubClustersJson"));
			prometheusInstancesItem.setRemoteReadIntraUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].RemoteReadIntraUrl"));
			prometheusInstancesItem.setRemoteReadInterUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].RemoteReadInterUrl"));
			prometheusInstancesItem.setRemoteWriteIntraUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].RemoteWriteIntraUrl"));
			prometheusInstancesItem.setRemoteWriteInterUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].RemoteWriteInterUrl"));
			prometheusInstancesItem.setPushGatewayIntraUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].PushGatewayIntraUrl"));
			prometheusInstancesItem.setPushGatewayInterUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].PushGatewayInterUrl"));
			prometheusInstancesItem.setHttpApiIntraUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].HttpApiIntraUrl"));
			prometheusInstancesItem.setHttpApiInterUrl(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].HttpApiInterUrl"));
			prometheusInstancesItem.setAuthToken(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].AuthToken"));
			prometheusInstancesItem.setPaymentType(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].PaymentType"));
			prometheusInstancesItem.setGrafanaInstanceId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].GrafanaInstanceId"));
			prometheusInstancesItem.setResourceGroupId(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].ResourceGroupId"));
			prometheusInstancesItem.setResourceType(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].ResourceType"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].Tags["+ j +"].TagKey"));
				tagsItem.setTagValue(_ctx.stringValue("ListPrometheusInstanceByTagAndResourceGroupIdResponse.Data.PrometheusInstances["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagsItem);
			}
			prometheusInstancesItem.setTags(tags);

			prometheusInstances.add(prometheusInstancesItem);
		}
		data.setPrometheusInstances(prometheusInstances);
		listPrometheusInstanceByTagAndResourceGroupIdResponse.setData(data);
	 
	 	return listPrometheusInstanceByTagAndResourceGroupIdResponse;
	}
}