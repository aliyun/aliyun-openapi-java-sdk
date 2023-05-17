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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeNodePoolVulsResponse;
import com.aliyuncs.cs.model.v20151215.DescribeNodePoolVulsResponse.Vul_recordsItem;
import com.aliyuncs.cs.model.v20151215.DescribeNodePoolVulsResponse.Vul_recordsItem.Vul_listItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodePoolVulsResponseUnmarshaller {

	public static DescribeNodePoolVulsResponse unmarshall(DescribeNodePoolVulsResponse describeNodePoolVulsResponse, UnmarshallerContext _ctx) {
		
		describeNodePoolVulsResponse.setVuls_fix_service_purchased(_ctx.booleanValue("DescribeNodePoolVulsResponse.vuls_fix_service_purchased"));

		List<Vul_recordsItem> vul_records = new ArrayList<Vul_recordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodePoolVulsResponse.vul_records.Length"); i++) {
			Vul_recordsItem vul_recordsItem = new Vul_recordsItem();
			vul_recordsItem.setInstance_id(_ctx.stringValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].instance_id"));
			vul_recordsItem.setNode_name(_ctx.stringValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].node_name"));

			List<Vul_listItem> vul_list = new ArrayList<Vul_listItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].vul_list.Length"); j++) {
				Vul_listItem vul_listItem = new Vul_listItem();
				vul_listItem.setName(_ctx.stringValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].vul_list["+ j +"].name"));
				vul_listItem.setAlias_name(_ctx.stringValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].vul_list["+ j +"].alias_name"));
				vul_listItem.setNecessity(_ctx.stringValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].vul_list["+ j +"].necessity"));

				List<String> cve_list = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].vul_list["+ j +"].cve_list.Length"); k++) {
					cve_list.add(_ctx.stringValue("DescribeNodePoolVulsResponse.vul_records["+ i +"].vul_list["+ j +"].cve_list["+ k +"]"));
				}
				vul_listItem.setCve_list(cve_list);

				vul_list.add(vul_listItem);
			}
			vul_recordsItem.setVul_list(vul_list);

			vul_records.add(vul_recordsItem);
		}
		describeNodePoolVulsResponse.setVul_records(vul_records);
	 
	 	return describeNodePoolVulsResponse;
	}
}