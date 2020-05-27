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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Quota;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Indexes;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Indexes.SearchFields;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Indexes.SearchFields.Id2;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Indexes.SearchFields._Default;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Tables;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Tables.Main;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Tables.Main.Fields;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Tables.Main.Fields.Buy;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Tables.Main.Fields.Id;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppResponse.Result.Schema.Tables.Main.Fields.Title;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppResponseUnmarshaller {

	public static DescribeAppResponse unmarshall(DescribeAppResponse describeAppResponse, UnmarshallerContext _ctx) {
		
		describeAppResponse.setRequestId(_ctx.stringValue("DescribeAppResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("DescribeAppResponse.result.id"));
		result.setDescription(_ctx.stringValue("DescribeAppResponse.result.description"));
		result.setStatus(_ctx.stringValue("DescribeAppResponse.result.status"));
		result.setType(_ctx.stringValue("DescribeAppResponse.result.type"));
		result.setClusterName(_ctx.stringValue("DescribeAppResponse.result.clusterName"));
		result.setAlgoDeploymentId(_ctx.integerValue("DescribeAppResponse.result.algoDeploymentId"));
		result.setCreated(_ctx.integerValue("DescribeAppResponse.result.created"));
		result.setAutoSwitch(_ctx.booleanValue("DescribeAppResponse.result.autoSwitch"));
		result.setProgressPercent(_ctx.integerValue("DescribeAppResponse.result.progressPercent"));

		List<String> fetchFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.fetchFields.Length"); i++) {
			fetchFields.add(_ctx.stringValue("DescribeAppResponse.result.fetchFields["+ i +"]"));
		}
		result.setFetchFields(fetchFields);

		Schema schema = new Schema();
		schema.setPluginInfo(_ctx.stringValue("DescribeAppResponse.result.schema.pluginInfo"));

		List<String> routeField = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.schema.routeField.Length"); i++) {
			routeField.add(_ctx.stringValue("DescribeAppResponse.result.schema.routeField["+ i +"]"));
		}
		schema.setRouteField(routeField);

		Tables tables = new Tables();

		Main main = new Main();
		main.setPrimaryTable(_ctx.booleanValue("DescribeAppResponse.result.schema.tables.main.primaryTable"));
		main.setName(_ctx.stringValue("DescribeAppResponse.result.schema.tables.main.name"));

		Fields fields = new Fields();

		Id id = new Id();

		List<String> fields1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.schema.tables.main.fields.id.fields.Length"); i++) {
			fields1.add(_ctx.stringValue("DescribeAppResponse.result.schema.tables.main.fields.id.fields["+ i +"]"));
		}
		id.setFields1(fields1);
		fields.setId(id);

		Title title = new Title();
		title.setType(_ctx.stringValue("DescribeAppResponse.result.schema.tables.main.fields.title.type"));
		title.setName(_ctx.stringValue("DescribeAppResponse.result.schema.tables.main.fields.title.name"));
		title.setPrimaryKey(_ctx.booleanValue("DescribeAppResponse.result.schema.tables.main.fields.title.primaryKey"));
		fields.setTitle(title);

		Buy buy = new Buy();
		buy.setType(_ctx.stringValue("DescribeAppResponse.result.schema.tables.main.fields.buy.type"));
		buy.setName(_ctx.stringValue("DescribeAppResponse.result.schema.tables.main.fields.buy.name"));
		buy.setPrimaryKey(_ctx.booleanValue("DescribeAppResponse.result.schema.tables.main.fields.buy.primaryKey"));
		fields.setBuy(buy);
		main.setFields(fields);
		tables.setMain(main);
		schema.setTables(tables);

		Indexes indexes = new Indexes();

		List<String> filterFields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.schema.indexes.filterFields.Length"); i++) {
			filterFields.add(_ctx.stringValue("DescribeAppResponse.result.schema.indexes.filterFields["+ i +"]"));
		}
		indexes.setFilterFields(filterFields);

		SearchFields searchFields = new SearchFields();

		_Default _default = new _Default();
		_default.setAnalyzer(_ctx.stringValue("DescribeAppResponse.result.schema.indexes.searchFields.default.analyzer"));

		List<String> fields3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.schema.indexes.searchFields.default.fields.Length"); i++) {
			fields3.add(_ctx.stringValue("DescribeAppResponse.result.schema.indexes.searchFields.default.fields["+ i +"]"));
		}
		_default.setFields3(fields3);
		searchFields.set_Default(_default);

		Id2 id2 = new Id2();

		List<String> fields4 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppResponse.result.schema.indexes.searchFields.id.fields.Length"); i++) {
			fields4.add(_ctx.stringValue("DescribeAppResponse.result.schema.indexes.searchFields.id.fields["+ i +"]"));
		}
		id2.setFields4(fields4);
		searchFields.setId2(id2);
		indexes.setSearchFields(searchFields);
		schema.setIndexes(indexes);
		result.setSchema(schema);

		Quota quota = new Quota();
		quota.setDocSize(_ctx.integerValue("DescribeAppResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("DescribeAppResponse.result.quota.computeResource"));
		quota.setQps(_ctx.integerValue("DescribeAppResponse.result.quota.qps"));
		quota.setSpec(_ctx.stringValue("DescribeAppResponse.result.quota.spec"));
		result.setQuota(quota);
		describeAppResponse.setResult(result);
	 
	 	return describeAppResponse;
	}
}