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

package com.aliyuncs.paifeaturestore.model.v20230621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetModelFeatureFGFeatureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetModelFeatureFGFeatureResponse extends AcsResponse {

	private String requestId;

	private List<RawFeaturesItem> rawFeatures;

	private List<LookupFeaturesItem> lookupFeatures;

	private List<SequenceFeaturesItem> sequenceFeatures;

	private List<String> reserves;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RawFeaturesItem> getRawFeatures() {
		return this.rawFeatures;
	}

	public void setRawFeatures(List<RawFeaturesItem> rawFeatures) {
		this.rawFeatures = rawFeatures;
	}

	public List<LookupFeaturesItem> getLookupFeatures() {
		return this.lookupFeatures;
	}

	public void setLookupFeatures(List<LookupFeaturesItem> lookupFeatures) {
		this.lookupFeatures = lookupFeatures;
	}

	public List<SequenceFeaturesItem> getSequenceFeatures() {
		return this.sequenceFeatures;
	}

	public void setSequenceFeatures(List<SequenceFeaturesItem> sequenceFeatures) {
		this.sequenceFeatures = sequenceFeatures;
	}

	public List<String> getReserves() {
		return this.reserves;
	}

	public void setReserves(List<String> reserves) {
		this.reserves = reserves;
	}

	public static class RawFeaturesItem {

		private String inputFeatureName;

		private String featureDomain;

		private String featureName;

		private String featureType;

		private String valueType;

		private String defaultValue;

		public String getInputFeatureName() {
			return this.inputFeatureName;
		}

		public void setInputFeatureName(String inputFeatureName) {
			this.inputFeatureName = inputFeatureName;
		}

		public String getFeatureDomain() {
			return this.featureDomain;
		}

		public void setFeatureDomain(String featureDomain) {
			this.featureDomain = featureDomain;
		}

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public String getFeatureType() {
			return this.featureType;
		}

		public void setFeatureType(String featureType) {
			this.featureType = featureType;
		}

		public String getValueType() {
			return this.valueType;
		}

		public void setValueType(String valueType) {
			this.valueType = valueType;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}
	}

	public static class LookupFeaturesItem {

		private String mapFeatureName;

		private String mapFeatureDomain;

		private String featureName;

		private String valueType;

		private String defaultValue;

		private String keyFeatureName;

		private String keyFeatureDomain;

		public String getMapFeatureName() {
			return this.mapFeatureName;
		}

		public void setMapFeatureName(String mapFeatureName) {
			this.mapFeatureName = mapFeatureName;
		}

		public String getMapFeatureDomain() {
			return this.mapFeatureDomain;
		}

		public void setMapFeatureDomain(String mapFeatureDomain) {
			this.mapFeatureDomain = mapFeatureDomain;
		}

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public String getValueType() {
			return this.valueType;
		}

		public void setValueType(String valueType) {
			this.valueType = valueType;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getKeyFeatureName() {
			return this.keyFeatureName;
		}

		public void setKeyFeatureName(String keyFeatureName) {
			this.keyFeatureName = keyFeatureName;
		}

		public String getKeyFeatureDomain() {
			return this.keyFeatureDomain;
		}

		public void setKeyFeatureDomain(String keyFeatureDomain) {
			this.keyFeatureDomain = keyFeatureDomain;
		}
	}

	public static class SequenceFeaturesItem {

		private String featureName;

		private Long sequenceLength;

		private String sequenceDelim;

		private String attributeDelim;

		private List<SubFeaturesItem> subFeatures;

		public String getFeatureName() {
			return this.featureName;
		}

		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}

		public Long getSequenceLength() {
			return this.sequenceLength;
		}

		public void setSequenceLength(Long sequenceLength) {
			this.sequenceLength = sequenceLength;
		}

		public String getSequenceDelim() {
			return this.sequenceDelim;
		}

		public void setSequenceDelim(String sequenceDelim) {
			this.sequenceDelim = sequenceDelim;
		}

		public String getAttributeDelim() {
			return this.attributeDelim;
		}

		public void setAttributeDelim(String attributeDelim) {
			this.attributeDelim = attributeDelim;
		}

		public List<SubFeaturesItem> getSubFeatures() {
			return this.subFeatures;
		}

		public void setSubFeatures(List<SubFeaturesItem> subFeatures) {
			this.subFeatures = subFeatures;
		}

		public static class SubFeaturesItem {

			private String inputFeatureName;

			private String featureDomain;

			private String featureName;

			private String featureType;

			private String valueType;

			private String defaultValue;

			public String getInputFeatureName() {
				return this.inputFeatureName;
			}

			public void setInputFeatureName(String inputFeatureName) {
				this.inputFeatureName = inputFeatureName;
			}

			public String getFeatureDomain() {
				return this.featureDomain;
			}

			public void setFeatureDomain(String featureDomain) {
				this.featureDomain = featureDomain;
			}

			public String getFeatureName() {
				return this.featureName;
			}

			public void setFeatureName(String featureName) {
				this.featureName = featureName;
			}

			public String getFeatureType() {
				return this.featureType;
			}

			public void setFeatureType(String featureType) {
				this.featureType = featureType;
			}

			public String getValueType() {
				return this.valueType;
			}

			public void setValueType(String valueType) {
				this.valueType = valueType;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}
		}
	}

	@Override
	public GetModelFeatureFGFeatureResponse getInstance(UnmarshallerContext context) {
		return	GetModelFeatureFGFeatureResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
