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

import com.aliyuncs.cs.model.v20151215.DescribeClusterVulsResponse;
import com.aliyuncs.cs.model.v20151215.DescribeClusterVulsResponse.Vul_record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterVulsResponseUnmarshaller {

	public static DescribeClusterVulsResponse unmarshall(DescribeClusterVulsResponse describeClusterVulsResponse, UnmarshallerContext _ctx) {
		

		List<Vul_record> vul_records = new ArrayList<Vul_record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterVulsResponse.vul_records.Length"); i++) {
			Vul_record vul_record = new Vul_record();
			vul_record.setNodepool_name(_ctx.stringValue("DescribeClusterVulsResponse.vul_records["+ i +"].nodepool_name"));
			vul_record.setNodepool_id(_ctx.stringValue("DescribeClusterVulsResponse.vul_records["+ i +"].nodepool_id"));
			vul_record.setNode_count(_ctx.integerValue("DescribeClusterVulsResponse.vul_records["+ i +"].node_count"));
			vul_record.setVul_name(_ctx.stringValue("DescribeClusterVulsResponse.vul_records["+ i +"].vul_name"));
			vul_record.setVul_alias_name(_ctx.stringValue("DescribeClusterVulsResponse.vul_records["+ i +"].vul_alias_name"));
			vul_record.setVul_type(_ctx.stringValue("DescribeClusterVulsResponse.vul_records["+ i +"].vul_type"));
			vul_record.setNecessity(_ctx.stringValue("DescribeClusterVulsResponse.vul_records["+ i +"].necessity"));

			List<String> cve_list = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterVulsResponse.vul_records["+ i +"].cve_list.Length"); j++) {
				cve_list.add(_ctx.stringValue("DescribeClusterVulsResponse.vul_records["+ i +"].cve_list["+ j +"]"));
			}
			vul_record.setCve_list(cve_list);

			vul_records.add(vul_record);
		}
		describeClusterVulsResponse.setVul_records(vul_records);
	 
	 	return describeClusterVulsResponse;
	}
}