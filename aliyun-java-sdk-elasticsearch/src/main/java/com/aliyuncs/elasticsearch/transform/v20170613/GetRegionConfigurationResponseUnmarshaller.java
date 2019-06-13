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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.DataDiskListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.EsVersionsLatestListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.Node;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.NodeSpecListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegionConfigurationResponseUnmarshaller {

	public static GetRegionConfigurationResponse unmarshall(GetRegionConfigurationResponse getRegionConfigurationResponse, UnmarshallerContext context) {
		
		getRegionConfigurationResponse.setRequestId(context.stringValue("GetRegionConfigurationResponse.RequestId"));

		Result result = new Result();
		result.setEnv(context.stringValue("GetRegionConfigurationResponse.Result.env"));
		result.setRegionId(context.stringValue("GetRegionConfigurationResponse.Result.regionId"));
		result.setCreateUrl(context.stringValue("GetRegionConfigurationResponse.Result.createUrl"));

		List<String> zones = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetRegionConfigurationResponse.Result.zones.Length"); i++) {
			zones.add(context.stringValue("GetRegionConfigurationResponse.Result.zones["+ i +"]"));
		}
		result.setZones(zones);

		List<String> esVersions = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("GetRegionConfigurationResponse.Result.esVersions.Length"); i++) {
			esVersions.add(context.stringValue("GetRegionConfigurationResponse.Result.esVersions["+ i +"]"));
		}
		result.setEsVersions(esVersions);

		Node node = new Node();
		node.setMinAmount(context.integerValue("GetRegionConfigurationResponse.Result.node.minAmount"));
		node.setMaxAmount(context.integerValue("GetRegionConfigurationResponse.Result.node.maxAmount"));
		result.setNode(node);

		List<DataDiskListItem> dataDiskList = new ArrayList<DataDiskListItem>();
		for (int i = 0; i < context.lengthValue("GetRegionConfigurationResponse.Result.dataDiskList.Length"); i++) {
			DataDiskListItem dataDiskListItem = new DataDiskListItem();
			dataDiskListItem.setDiskType(context.stringValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].diskType"));
			dataDiskListItem.setMinSize(context.integerValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].minSize"));
			dataDiskListItem.setMaxSize(context.integerValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].maxSize"));
			dataDiskListItem.setScaleLimit(context.integerValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].scaleLimit"));

			List<String> valueLimitSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].valueLimitSet.Length"); j++) {
				valueLimitSet.add(context.stringValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].valueLimitSet["+ j +"]"));
			}
			dataDiskListItem.setValueLimitSet(valueLimitSet);

			dataDiskList.add(dataDiskListItem);
		}
		result.setDataDiskList(dataDiskList);

		List<EsVersionsLatestListItem> esVersionsLatestList = new ArrayList<EsVersionsLatestListItem>();
		for (int i = 0; i < context.lengthValue("GetRegionConfigurationResponse.Result.esVersionsLatestList.Length"); i++) {
			EsVersionsLatestListItem esVersionsLatestListItem = new EsVersionsLatestListItem();
			esVersionsLatestListItem.setKey(context.stringValue("GetRegionConfigurationResponse.Result.esVersionsLatestList["+ i +"].key"));
			esVersionsLatestListItem.setValue(context.stringValue("GetRegionConfigurationResponse.Result.esVersionsLatestList["+ i +"].value"));

			esVersionsLatestList.add(esVersionsLatestListItem);
		}
		result.setEsVersionsLatestList(esVersionsLatestList);

		List<NodeSpecListItem> nodeSpecList = new ArrayList<NodeSpecListItem>();
		for (int i = 0; i < context.lengthValue("GetRegionConfigurationResponse.Result.nodeSpecList.Length"); i++) {
			NodeSpecListItem nodeSpecListItem = new NodeSpecListItem();
			nodeSpecListItem.setCpuCount(context.integerValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].cpuCount"));
			nodeSpecListItem.setMemorySize(context.integerValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].memorySize"));
			nodeSpecListItem.setEnable(context.booleanValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].enable"));
			nodeSpecListItem.setSpec(context.stringValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].spec"));
			nodeSpecListItem.setDiskType(context.stringValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].diskType"));
			nodeSpecListItem.setDisk(context.integerValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].disk"));
			nodeSpecListItem.setSpecGroupType(context.stringValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].specGroupType"));

			nodeSpecList.add(nodeSpecListItem);
		}
		result.setNodeSpecList(nodeSpecList);
		getRegionConfigurationResponse.setResult(result);
	 
	 	return getRegionConfigurationResponse;
	}
}