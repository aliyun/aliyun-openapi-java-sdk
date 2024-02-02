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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureFGFeatureResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureFGFeatureResponse.LookupFeaturesItem;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureFGFeatureResponse.RawFeaturesItem;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureFGFeatureResponse.SequenceFeaturesItem;
import com.aliyuncs.paifeaturestore.model.v20230621.GetModelFeatureFGFeatureResponse.SequenceFeaturesItem.SubFeaturesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelFeatureFGFeatureResponseUnmarshaller {

	public static GetModelFeatureFGFeatureResponse unmarshall(GetModelFeatureFGFeatureResponse getModelFeatureFGFeatureResponse, UnmarshallerContext _ctx) {
		
		getModelFeatureFGFeatureResponse.setRequestId(_ctx.stringValue("GetModelFeatureFGFeatureResponse.RequestId"));

		List<String> reserves = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetModelFeatureFGFeatureResponse.Reserves.Length"); i++) {
			reserves.add(_ctx.stringValue("GetModelFeatureFGFeatureResponse.Reserves["+ i +"]"));
		}
		getModelFeatureFGFeatureResponse.setReserves(reserves);

		List<RawFeaturesItem> rawFeatures = new ArrayList<RawFeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelFeatureFGFeatureResponse.RawFeatures.Length"); i++) {
			RawFeaturesItem rawFeaturesItem = new RawFeaturesItem();
			rawFeaturesItem.setInputFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.RawFeatures["+ i +"].InputFeatureName"));
			rawFeaturesItem.setFeatureDomain(_ctx.stringValue("GetModelFeatureFGFeatureResponse.RawFeatures["+ i +"].FeatureDomain"));
			rawFeaturesItem.setFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.RawFeatures["+ i +"].FeatureName"));
			rawFeaturesItem.setFeatureType(_ctx.stringValue("GetModelFeatureFGFeatureResponse.RawFeatures["+ i +"].FeatureType"));
			rawFeaturesItem.setValueType(_ctx.stringValue("GetModelFeatureFGFeatureResponse.RawFeatures["+ i +"].ValueType"));
			rawFeaturesItem.setDefaultValue(_ctx.stringValue("GetModelFeatureFGFeatureResponse.RawFeatures["+ i +"].DefaultValue"));

			rawFeatures.add(rawFeaturesItem);
		}
		getModelFeatureFGFeatureResponse.setRawFeatures(rawFeatures);

		List<LookupFeaturesItem> lookupFeatures = new ArrayList<LookupFeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelFeatureFGFeatureResponse.LookupFeatures.Length"); i++) {
			LookupFeaturesItem lookupFeaturesItem = new LookupFeaturesItem();
			lookupFeaturesItem.setMapFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.LookupFeatures["+ i +"].MapFeatureName"));
			lookupFeaturesItem.setMapFeatureDomain(_ctx.stringValue("GetModelFeatureFGFeatureResponse.LookupFeatures["+ i +"].MapFeatureDomain"));
			lookupFeaturesItem.setFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.LookupFeatures["+ i +"].FeatureName"));
			lookupFeaturesItem.setValueType(_ctx.stringValue("GetModelFeatureFGFeatureResponse.LookupFeatures["+ i +"].ValueType"));
			lookupFeaturesItem.setDefaultValue(_ctx.stringValue("GetModelFeatureFGFeatureResponse.LookupFeatures["+ i +"].DefaultValue"));
			lookupFeaturesItem.setKeyFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.LookupFeatures["+ i +"].KeyFeatureName"));
			lookupFeaturesItem.setKeyFeatureDomain(_ctx.stringValue("GetModelFeatureFGFeatureResponse.LookupFeatures["+ i +"].KeyFeatureDomain"));

			lookupFeatures.add(lookupFeaturesItem);
		}
		getModelFeatureFGFeatureResponse.setLookupFeatures(lookupFeatures);

		List<SequenceFeaturesItem> sequenceFeatures = new ArrayList<SequenceFeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelFeatureFGFeatureResponse.SequenceFeatures.Length"); i++) {
			SequenceFeaturesItem sequenceFeaturesItem = new SequenceFeaturesItem();
			sequenceFeaturesItem.setFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].FeatureName"));
			sequenceFeaturesItem.setSequenceLength(_ctx.longValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SequenceLength"));
			sequenceFeaturesItem.setSequenceDelim(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SequenceDelim"));
			sequenceFeaturesItem.setAttributeDelim(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].AttributeDelim"));

			List<SubFeaturesItem> subFeatures = new ArrayList<SubFeaturesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SubFeatures.Length"); j++) {
				SubFeaturesItem subFeaturesItem = new SubFeaturesItem();
				subFeaturesItem.setInputFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SubFeatures["+ j +"].InputFeatureName"));
				subFeaturesItem.setFeatureDomain(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SubFeatures["+ j +"].FeatureDomain"));
				subFeaturesItem.setFeatureName(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SubFeatures["+ j +"].FeatureName"));
				subFeaturesItem.setFeatureType(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SubFeatures["+ j +"].FeatureType"));
				subFeaturesItem.setValueType(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SubFeatures["+ j +"].ValueType"));
				subFeaturesItem.setDefaultValue(_ctx.stringValue("GetModelFeatureFGFeatureResponse.SequenceFeatures["+ i +"].SubFeatures["+ j +"].DefaultValue"));

				subFeatures.add(subFeaturesItem);
			}
			sequenceFeaturesItem.setSubFeatures(subFeatures);

			sequenceFeatures.add(sequenceFeaturesItem);
		}
		getModelFeatureFGFeatureResponse.setSequenceFeatures(sequenceFeatures);
	 
	 	return getModelFeatureFGFeatureResponse;
	}
}