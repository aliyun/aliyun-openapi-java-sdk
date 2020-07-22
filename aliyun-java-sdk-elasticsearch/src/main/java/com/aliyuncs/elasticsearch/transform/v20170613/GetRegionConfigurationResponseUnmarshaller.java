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
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.CategoryEntity;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.CategoryEntity.VersionEntity;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.ClientNodeAmountRange;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.DataDiskListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.Disk;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.ElasticNodeProperties;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.ElasticNodeProperties.AmountRange6;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.ElasticNodeProperties.Disk8;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.EsVersionsLatestListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.JvmConfine;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.KibanaNodeProperties;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.KibanaNodeProperties.AmountRange4;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.Node;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.NodeSpecListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.WarmNodeProperties;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.WarmNodeProperties.AmountRange;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionConfigurationResponse.Result.WarmNodeProperties.Disk1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegionConfigurationResponseUnmarshaller {

	public static GetRegionConfigurationResponse unmarshall(GetRegionConfigurationResponse getRegionConfigurationResponse, UnmarshallerContext _ctx) {
		
		getRegionConfigurationResponse.setRequestId(_ctx.stringValue("GetRegionConfigurationResponse.RequestId"));

		Result result = new Result();
		result.setEnv(_ctx.stringValue("GetRegionConfigurationResponse.Result.env"));
		result.setRegionId(_ctx.stringValue("GetRegionConfigurationResponse.Result.regionId"));
		result.setCreateUrl(_ctx.stringValue("GetRegionConfigurationResponse.Result.createUrl"));

		List<String> zones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.zones.Length"); i++) {
			zones.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.zones["+ i +"]"));
		}
		result.setZones(zones);

		List<String> esVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.esVersions.Length"); i++) {
			esVersions.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.esVersions["+ i +"]"));
		}
		result.setEsVersions(esVersions);

		List<String> masterSpec = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.masterSpec.Length"); i++) {
			masterSpec.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.masterSpec["+ i +"]"));
		}
		result.setMasterSpec(masterSpec);

		List<String> clientNodeSpec = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.clientNodeSpec.Length"); i++) {
			clientNodeSpec.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.clientNodeSpec["+ i +"]"));
		}
		result.setClientNodeSpec(clientNodeSpec);

		List<String> instanceSupportNodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.instanceSupportNodes.Length"); i++) {
			instanceSupportNodes.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.instanceSupportNodes["+ i +"]"));
		}
		result.setInstanceSupportNodes(instanceSupportNodes);

		Node node = new Node();
		node.setMinAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.node.minAmount"));
		node.setMaxAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.node.maxAmount"));
		result.setNode(node);

		JvmConfine jvmConfine = new JvmConfine();
		jvmConfine.setMemory(_ctx.integerValue("GetRegionConfigurationResponse.Result.jvmConfine.memory"));

		List<String> supportGcs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.jvmConfine.supportGcs.Length"); i++) {
			supportGcs.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.jvmConfine.supportGcs["+ i +"]"));
		}
		jvmConfine.setSupportGcs(supportGcs);

		List<String> supportEsVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.jvmConfine.supportEsVersions.Length"); i++) {
			supportEsVersions.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.jvmConfine.supportEsVersions["+ i +"]"));
		}
		jvmConfine.setSupportEsVersions(supportEsVersions);
		result.setJvmConfine(jvmConfine);

		ClientNodeAmountRange clientNodeAmountRange = new ClientNodeAmountRange();
		clientNodeAmountRange.setMinAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.clientNodeAmountRange.minAmount"));
		clientNodeAmountRange.setMaxAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.clientNodeAmountRange.maxAmount"));
		result.setClientNodeAmountRange(clientNodeAmountRange);

		WarmNodeProperties warmNodeProperties = new WarmNodeProperties();

		List<String> spec = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.warmNodeProperties.spec.Length"); i++) {
			spec.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.warmNodeProperties.spec["+ i +"]"));
		}
		warmNodeProperties.setSpec(spec);

		AmountRange amountRange = new AmountRange();
		amountRange.setMaxAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.warmNodeProperties.amountRange.maxAmount"));
		amountRange.setMinAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.warmNodeProperties.amountRange.minAmount"));
		warmNodeProperties.setAmountRange(amountRange);

		List<Disk1> diskList = new ArrayList<Disk1>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList.Length"); i++) {
			Disk1 disk1 = new Disk1();
			disk1.setDiskType(_ctx.stringValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList["+ i +"].diskType"));
			disk1.setMaxSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList["+ i +"].maxSize"));
			disk1.setMinSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList["+ i +"].minSize"));
			disk1.setScaleLimit(_ctx.integerValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList["+ i +"].scaleLimit"));
			disk1.setDiskEncryption(_ctx.booleanValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList["+ i +"].diskEncryption"));

			List<String> valueLimitSet2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList["+ i +"].valueLimitSet.Length"); j++) {
				valueLimitSet2.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.warmNodeProperties.diskList["+ i +"].valueLimitSet["+ j +"]"));
			}
			disk1.setValueLimitSet2(valueLimitSet2);

			diskList.add(disk1);
		}
		warmNodeProperties.setDiskList(diskList);
		result.setWarmNodeProperties(warmNodeProperties);

		KibanaNodeProperties kibanaNodeProperties = new KibanaNodeProperties();

		List<String> spec3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.kibanaNodeProperties.spec.Length"); i++) {
			spec3.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.kibanaNodeProperties.spec["+ i +"]"));
		}
		kibanaNodeProperties.setSpec3(spec3);

		AmountRange4 amountRange4 = new AmountRange4();
		amountRange4.setMaxAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.kibanaNodeProperties.amountRange.maxAmount"));
		amountRange4.setMinAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.kibanaNodeProperties.amountRange.minAmount"));
		kibanaNodeProperties.setAmountRange4(amountRange4);
		result.setKibanaNodeProperties(kibanaNodeProperties);

		ElasticNodeProperties elasticNodeProperties = new ElasticNodeProperties();

		List<String> spec5 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.spec.Length"); i++) {
			spec5.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.spec["+ i +"]"));
		}
		elasticNodeProperties.setSpec5(spec5);

		AmountRange6 amountRange6 = new AmountRange6();
		amountRange6.setMaxAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.amountRange.maxAmount"));
		amountRange6.setMinAmount(_ctx.integerValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.amountRange.minAmount"));
		elasticNodeProperties.setAmountRange6(amountRange6);

		List<Disk8> diskList7 = new ArrayList<Disk8>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList.Length"); i++) {
			Disk8 disk8 = new Disk8();
			disk8.setDiskType(_ctx.stringValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList["+ i +"].diskType"));
			disk8.setMaxSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList["+ i +"].maxSize"));
			disk8.setMinSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList["+ i +"].minSize"));
			disk8.setScaleLimit(_ctx.integerValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList["+ i +"].scaleLimit"));
			disk8.setDiskEncryption(_ctx.booleanValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList["+ i +"].diskEncryption"));

			List<String> valueLimitSet9 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList["+ i +"].valueLimitSet.Length"); j++) {
				valueLimitSet9.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.elasticNodeProperties.diskList["+ i +"].valueLimitSet["+ j +"]"));
			}
			disk8.setValueLimitSet9(valueLimitSet9);

			diskList7.add(disk8);
		}
		elasticNodeProperties.setDiskList7(diskList7);
		result.setElasticNodeProperties(elasticNodeProperties);

		List<DataDiskListItem> dataDiskList = new ArrayList<DataDiskListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.dataDiskList.Length"); i++) {
			DataDiskListItem dataDiskListItem = new DataDiskListItem();
			dataDiskListItem.setDiskType(_ctx.stringValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].diskType"));
			dataDiskListItem.setMinSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].minSize"));
			dataDiskListItem.setMaxSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].maxSize"));
			dataDiskListItem.setScaleLimit(_ctx.integerValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].scaleLimit"));

			List<String> valueLimitSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].valueLimitSet.Length"); j++) {
				valueLimitSet.add(_ctx.stringValue("GetRegionConfigurationResponse.Result.dataDiskList["+ i +"].valueLimitSet["+ j +"]"));
			}
			dataDiskListItem.setValueLimitSet(valueLimitSet);

			dataDiskList.add(dataDiskListItem);
		}
		result.setDataDiskList(dataDiskList);

		List<EsVersionsLatestListItem> esVersionsLatestList = new ArrayList<EsVersionsLatestListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.esVersionsLatestList.Length"); i++) {
			EsVersionsLatestListItem esVersionsLatestListItem = new EsVersionsLatestListItem();
			esVersionsLatestListItem.setKey(_ctx.stringValue("GetRegionConfigurationResponse.Result.esVersionsLatestList["+ i +"].key"));
			esVersionsLatestListItem.setValue(_ctx.stringValue("GetRegionConfigurationResponse.Result.esVersionsLatestList["+ i +"].value"));

			esVersionsLatestList.add(esVersionsLatestListItem);
		}
		result.setEsVersionsLatestList(esVersionsLatestList);

		List<NodeSpecListItem> nodeSpecList = new ArrayList<NodeSpecListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.nodeSpecList.Length"); i++) {
			NodeSpecListItem nodeSpecListItem = new NodeSpecListItem();
			nodeSpecListItem.setCpuCount(_ctx.integerValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].cpuCount"));
			nodeSpecListItem.setMemorySize(_ctx.integerValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].memorySize"));
			nodeSpecListItem.setEnable(_ctx.booleanValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].enable"));
			nodeSpecListItem.setSpec(_ctx.stringValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].spec"));
			nodeSpecListItem.setDiskType(_ctx.stringValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].diskType"));
			nodeSpecListItem.setDisk(_ctx.integerValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].disk"));
			nodeSpecListItem.setSpecGroupType(_ctx.stringValue("GetRegionConfigurationResponse.Result.nodeSpecList["+ i +"].specGroupType"));

			nodeSpecList.add(nodeSpecListItem);
		}
		result.setNodeSpecList(nodeSpecList);

		List<Disk> clientNodeDiskList = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.clientNodeDiskList.Length"); i++) {
			Disk disk = new Disk();
			disk.setDiskType(_ctx.stringValue("GetRegionConfigurationResponse.Result.clientNodeDiskList["+ i +"].diskType"));
			disk.setMinSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.clientNodeDiskList["+ i +"].minSize"));
			disk.setMaxSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.clientNodeDiskList["+ i +"].maxSize"));
			disk.setScaleLimit(_ctx.integerValue("GetRegionConfigurationResponse.Result.clientNodeDiskList["+ i +"].scaleLimit"));

			clientNodeDiskList.add(disk);
		}
		result.setClientNodeDiskList(clientNodeDiskList);

		List<Disk> masterDiskList = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.masterDiskList.Length"); i++) {
			Disk disk_ = new Disk();
			disk_.setDiskType(_ctx.stringValue("GetRegionConfigurationResponse.Result.masterDiskList["+ i +"].diskType"));
			disk_.setMinSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.masterDiskList["+ i +"].minSize"));
			disk_.setMaxSize(_ctx.integerValue("GetRegionConfigurationResponse.Result.masterDiskList["+ i +"].maxSize"));
			disk_.setScaleLimit(_ctx.integerValue("GetRegionConfigurationResponse.Result.masterDiskList["+ i +"].scaleLimit"));

			masterDiskList.add(disk_);
		}
		result.setMasterDiskList(masterDiskList);

		List<CategoryEntity> supportVersions = new ArrayList<CategoryEntity>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionConfigurationResponse.Result.supportVersions.Length"); i++) {
			CategoryEntity categoryEntity = new CategoryEntity();
			categoryEntity.setInstanceCategory(_ctx.stringValue("GetRegionConfigurationResponse.Result.supportVersions["+ i +"].instanceCategory"));

			List<VersionEntity> supportVersionList = new ArrayList<VersionEntity>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionConfigurationResponse.Result.supportVersions["+ i +"].supportVersionList.Length"); j++) {
				VersionEntity versionEntity = new VersionEntity();
				versionEntity.setKey(_ctx.stringValue("GetRegionConfigurationResponse.Result.supportVersions["+ i +"].supportVersionList["+ j +"].key"));
				versionEntity.setValue(_ctx.stringValue("GetRegionConfigurationResponse.Result.supportVersions["+ i +"].supportVersionList["+ j +"].value"));

				supportVersionList.add(versionEntity);
			}
			categoryEntity.setSupportVersionList(supportVersionList);

			supportVersions.add(categoryEntity);
		}
		result.setSupportVersions(supportVersions);
		getRegionConfigurationResponse.setResult(result);
	 
	 	return getRegionConfigurationResponse;
	}
}