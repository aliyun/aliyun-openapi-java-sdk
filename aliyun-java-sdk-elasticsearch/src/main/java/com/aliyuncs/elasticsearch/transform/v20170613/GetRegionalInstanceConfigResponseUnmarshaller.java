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

import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result.ClientNodeAmountRange;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result.ClientNodeDiskListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result.DataNodeAmountRange;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result.DataNodeDiskListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result.DataNodeDiskListItem.SubClassificationConfinesItem2;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result.MasterDiskListItem;
import com.aliyuncs.elasticsearch.model.v20170613.GetRegionalInstanceConfigResponse.Result.MasterDiskListItem.SubClassificationConfinesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegionalInstanceConfigResponseUnmarshaller {

	public static GetRegionalInstanceConfigResponse unmarshall(GetRegionalInstanceConfigResponse getRegionalInstanceConfigResponse, UnmarshallerContext _ctx) {
		
		getRegionalInstanceConfigResponse.setRequestId(_ctx.stringValue("GetRegionalInstanceConfigResponse.RequestId"));

		Result result = new Result();
		result.setSpecInfoMap(_ctx.mapValue("GetRegionalInstanceConfigResponse.Result.specInfoMap"));

		List<String> clientSpecs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.clientSpecs.Length"); i++) {
			clientSpecs.add(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.clientSpecs["+ i +"]"));
		}
		result.setClientSpecs(clientSpecs);

		List<String> dataNodeSpecs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.dataNodeSpecs.Length"); i++) {
			dataNodeSpecs.add(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.dataNodeSpecs["+ i +"]"));
		}
		result.setDataNodeSpecs(dataNodeSpecs);

		List<String> kibanaSpecs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.kibanaSpecs.Length"); i++) {
			kibanaSpecs.add(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.kibanaSpecs["+ i +"]"));
		}
		result.setKibanaSpecs(kibanaSpecs);

		List<String> masterSpecs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.masterSpecs.Length"); i++) {
			masterSpecs.add(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.masterSpecs["+ i +"]"));
		}
		result.setMasterSpecs(masterSpecs);

		List<String> versions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.versions.Length"); i++) {
			versions.add(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.versions["+ i +"]"));
		}
		result.setVersions(versions);

		List<String> masterAmountRange = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.masterAmountRange.Length"); i++) {
			masterAmountRange.add(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.masterAmountRange["+ i +"]"));
		}
		result.setMasterAmountRange(masterAmountRange);

		ClientNodeAmountRange clientNodeAmountRange = new ClientNodeAmountRange();
		clientNodeAmountRange.setMinAmount(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.clientNodeAmountRange.minAmount"));
		clientNodeAmountRange.setMaxAmount(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.clientNodeAmountRange.maxAmount"));
		result.setClientNodeAmountRange(clientNodeAmountRange);

		DataNodeAmountRange dataNodeAmountRange = new DataNodeAmountRange();
		dataNodeAmountRange.setMinAmount(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeAmountRange.minAmount"));
		dataNodeAmountRange.setMaxAmount(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeAmountRange.maxAmount"));
		result.setDataNodeAmountRange(dataNodeAmountRange);

		List<MasterDiskListItem> masterDiskList = new ArrayList<MasterDiskListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.masterDiskList.Length"); i++) {
			MasterDiskListItem masterDiskListItem = new MasterDiskListItem();
			masterDiskListItem.setMinSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].minSize"));
			masterDiskListItem.setMaxSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].maxSize"));
			masterDiskListItem.setScaleLimit(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].scaleLimit"));
			masterDiskListItem.setDiskType(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].diskType"));

			List<SubClassificationConfinesItem> subClassificationConfines = new ArrayList<SubClassificationConfinesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].subClassificationConfines.Length"); j++) {
				SubClassificationConfinesItem subClassificationConfinesItem = new SubClassificationConfinesItem();
				subClassificationConfinesItem.setMinSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].subClassificationConfines["+ j +"].minSize"));
				subClassificationConfinesItem.setMaxSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].subClassificationConfines["+ j +"].maxSize"));
				subClassificationConfinesItem.setPerformanceLevel(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.masterDiskList["+ i +"].subClassificationConfines["+ j +"].performanceLevel"));

				subClassificationConfines.add(subClassificationConfinesItem);
			}
			masterDiskListItem.setSubClassificationConfines(subClassificationConfines);

			masterDiskList.add(masterDiskListItem);
		}
		result.setMasterDiskList(masterDiskList);

		List<ClientNodeDiskListItem> clientNodeDiskList = new ArrayList<ClientNodeDiskListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.clientNodeDiskList.Length"); i++) {
			ClientNodeDiskListItem clientNodeDiskListItem = new ClientNodeDiskListItem();
			clientNodeDiskListItem.setMinSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.clientNodeDiskList["+ i +"].minSize"));
			clientNodeDiskListItem.setMaxSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.clientNodeDiskList["+ i +"].maxSize"));
			clientNodeDiskListItem.setScaleLimit(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.clientNodeDiskList["+ i +"].scaleLimit"));
			clientNodeDiskListItem.setDiskType(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.clientNodeDiskList["+ i +"].diskType"));

			clientNodeDiskList.add(clientNodeDiskListItem);
		}
		result.setClientNodeDiskList(clientNodeDiskList);

		List<DataNodeDiskListItem> dataNodeDiskList = new ArrayList<DataNodeDiskListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList.Length"); i++) {
			DataNodeDiskListItem dataNodeDiskListItem = new DataNodeDiskListItem();
			dataNodeDiskListItem.setMinSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].minSize"));
			dataNodeDiskListItem.setMaxSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].maxSize"));
			dataNodeDiskListItem.setScaleLimit(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].scaleLimit"));
			dataNodeDiskListItem.setDiskType(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].diskType"));

			List<Integer> valueLimitSet = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].valueLimitSet.Length"); j++) {
				valueLimitSet.add(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].valueLimitSet["+ j +"]"));
			}
			dataNodeDiskListItem.setValueLimitSet(valueLimitSet);

			List<SubClassificationConfinesItem2> subClassificationConfines1 = new ArrayList<SubClassificationConfinesItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].subClassificationConfines.Length"); j++) {
				SubClassificationConfinesItem2 subClassificationConfinesItem2 = new SubClassificationConfinesItem2();
				subClassificationConfinesItem2.setMinSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].subClassificationConfines["+ j +"].minSize"));
				subClassificationConfinesItem2.setMaxSize(_ctx.integerValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].subClassificationConfines["+ j +"].maxSize"));
				subClassificationConfinesItem2.setPerformanceLevel(_ctx.stringValue("GetRegionalInstanceConfigResponse.Result.dataNodeDiskList["+ i +"].subClassificationConfines["+ j +"].performanceLevel"));

				subClassificationConfines1.add(subClassificationConfinesItem2);
			}
			dataNodeDiskListItem.setSubClassificationConfines1(subClassificationConfines1);

			dataNodeDiskList.add(dataNodeDiskListItem);
		}
		result.setDataNodeDiskList(dataNodeDiskList);
		getRegionalInstanceConfigResponse.setResult(result);
	 
	 	return getRegionalInstanceConfigResponse;
	}
}