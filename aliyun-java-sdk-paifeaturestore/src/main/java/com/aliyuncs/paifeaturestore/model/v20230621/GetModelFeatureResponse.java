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
import com.aliyuncs.paifeaturestore.transform.v20230621.GetModelFeatureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetModelFeatureResponse extends AcsResponse {

	private String requestId;

	private String projectId;

	private String projectName;

	private String name;

	private String owner;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private String labelTableId;

	private String labelTableName;

	private String trainingSetTable;

	private String trainingSetFGTable;

	private List<FeaturesItem> features;

	private Relations relations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	public String getLabelTableId() {
		return this.labelTableId;
	}

	public void setLabelTableId(String labelTableId) {
		this.labelTableId = labelTableId;
	}

	public String getLabelTableName() {
		return this.labelTableName;
	}

	public void setLabelTableName(String labelTableName) {
		this.labelTableName = labelTableName;
	}

	public String getTrainingSetTable() {
		return this.trainingSetTable;
	}

	public void setTrainingSetTable(String trainingSetTable) {
		this.trainingSetTable = trainingSetTable;
	}

	public String getTrainingSetFGTable() {
		return this.trainingSetFGTable;
	}

	public void setTrainingSetFGTable(String trainingSetFGTable) {
		this.trainingSetFGTable = trainingSetFGTable;
	}

	public List<FeaturesItem> getFeatures() {
		return this.features;
	}

	public void setFeatures(List<FeaturesItem> features) {
		this.features = features;
	}

	public Relations getRelations() {
		return this.relations;
	}

	public void setRelations(Relations relations) {
		this.relations = relations;
	}

	public static class FeaturesItem {

		private String featureViewId;

		private String featureViewName;

		private String name;

		private String type;

		private String aliasName;

		public String getFeatureViewId() {
			return this.featureViewId;
		}

		public void setFeatureViewId(String featureViewId) {
			this.featureViewId = featureViewId;
		}

		public String getFeatureViewName() {
			return this.featureViewName;
		}

		public void setFeatureViewName(String featureViewName) {
			this.featureViewName = featureViewName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}
	}

	public static class Relations {

		private List<DomainsItem> domains;

		private List<LinksItem> links;

		public List<DomainsItem> getDomains() {
			return this.domains;
		}

		public void setDomains(List<DomainsItem> domains) {
			this.domains = domains;
		}

		public List<LinksItem> getLinks() {
			return this.links;
		}

		public void setLinks(List<LinksItem> links) {
			this.links = links;
		}

		public static class DomainsItem {

			private String id;

			private String name;

			private String domainType;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDomainType() {
				return this.domainType;
			}

			public void setDomainType(String domainType) {
				this.domainType = domainType;
			}
		}

		public static class LinksItem {

			private String from;

			private String to;

			private String link;

			public String getFrom() {
				return this.from;
			}

			public void setFrom(String from) {
				this.from = from;
			}

			public String getTo() {
				return this.to;
			}

			public void setTo(String to) {
				this.to = to;
			}

			public String getLink() {
				return this.link;
			}

			public void setLink(String link) {
				this.link = link;
			}
		}
	}

	@Override
	public GetModelFeatureResponse getInstance(UnmarshallerContext context) {
		return	GetModelFeatureResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
