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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.ListSelectedFeaturesResponse;
import com.aliyuncs.zhuque.model.v20160701.ListSelectedFeaturesResponse.SelectComponentItem;
import com.aliyuncs.zhuque.model.v20160701.ListSelectedFeaturesResponse.SelectComponentItem.FeatureListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSelectedFeaturesResponseUnmarshaller {

	public static ListSelectedFeaturesResponse unmarshall(ListSelectedFeaturesResponse listSelectedFeaturesResponse, UnmarshallerContext context) {
		
		listSelectedFeaturesResponse.setRequestId(context.stringValue("ListSelectedFeaturesResponse.RequestId"));
		listSelectedFeaturesResponse.setResult(context.stringValue("ListSelectedFeaturesResponse.Result"));
		listSelectedFeaturesResponse.setMessage(context.stringValue("ListSelectedFeaturesResponse.Message"));

		List<SelectComponentItem> selectComponent = new ArrayList<SelectComponentItem>();
		for (int i = 0; i < context.lengthValue("ListSelectedFeaturesResponse.SelectComponent.Length"); i++) {
			SelectComponentItem selectComponentItem = new SelectComponentItem();
			selectComponentItem.setCategory(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Category"));
			selectComponentItem.setCommodity(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Commodity"));
			selectComponentItem.setCommodityCode(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].CommodityCode"));
			selectComponentItem.setCommodityMandatory(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].CommodityMandatory"));
			selectComponentItem.setCommodityType(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].CommodityType"));
			selectComponentItem.setModule(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Module"));
			selectComponentItem.setModuleCode(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ModuleCode"));
			selectComponentItem.setModuleType(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ModuleType"));
			selectComponentItem.setMandatory(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Mandatory"));
			selectComponentItem.setModuleDescription(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ModuleDescription"));
			selectComponentItem.setDetailedName(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].DetailedName"));
			selectComponentItem.setIndex(context.integerValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Index"));
			selectComponentItem.setInstalled(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Installed"));
			selectComponentItem.setIsHidden(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].IsHidden"));
			selectComponentItem.setIsInvalid(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].IsInvalid"));
			selectComponentItem.setInvalidReason(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].InvalidReason"));
			selectComponentItem.setPriceSourceType(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].PriceSourceType"));
			selectComponentItem.setLicenseUnit(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].LicenseUnit"));
			selectComponentItem.setCapacity(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Capacity"));
			selectComponentItem.setProduct(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Product"));
			selectComponentItem.setFeature(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Feature"));
			selectComponentItem.setDescription(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Description"));
			selectComponentItem.setSelected(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Selected"));
			selectComponentItem.setIsEdited(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].IsEdited"));
			selectComponentItem.setCount(context.integerValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Count"));
			selectComponentItem.setHiddenSupportDisasterRecovery(context.booleanValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].HiddenSupportDisasterRecovery"));
			selectComponentItem.setDeploymentLocation(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].DeploymentLocation"));
			selectComponentItem.setUpdated(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].Updated"));

			List<String> moduleDependencyList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ModuleDependencyList.Length"); j++) {
				moduleDependencyList.add(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ModuleDependencyList["+ j +"]"));
			}
			selectComponentItem.setModuleDependencyList(moduleDependencyList);

			List<String> moduleExclusiveList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ModuleExclusiveList.Length"); j++) {
				moduleExclusiveList.add(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ModuleExclusiveList["+ j +"]"));
			}
			selectComponentItem.setModuleExclusiveList(moduleExclusiveList);

			List<String> priceSourceCodes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].PriceSourceCodes.Length"); j++) {
				priceSourceCodes.add(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].PriceSourceCodes["+ j +"]"));
			}
			selectComponentItem.setPriceSourceCodes(priceSourceCodes);

			List<String> exclusiveFeatureGroup = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ExclusiveFeatureGroup.Length"); j++) {
				exclusiveFeatureGroup.add(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].ExclusiveFeatureGroup["+ j +"]"));
			}
			selectComponentItem.setExclusiveFeatureGroup(exclusiveFeatureGroup);

			List<FeatureListItem> featureList = new ArrayList<FeatureListItem>();
			for (int j = 0; j < context.lengthValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].FeatureList.Length"); j++) {
				FeatureListItem featureListItem = new FeatureListItem();
				featureListItem.setProduct(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].FeatureList["+ j +"].Product"));
				featureListItem.setFeature(context.stringValue("ListSelectedFeaturesResponse.SelectComponent["+ i +"].FeatureList["+ j +"].Feature"));

				featureList.add(featureListItem);
			}
			selectComponentItem.setFeatureList(featureList);

			selectComponent.add(selectComponentItem);
		}
		listSelectedFeaturesResponse.setSelectComponent(selectComponent);
	 
	 	return listSelectedFeaturesResponse;
	}
}