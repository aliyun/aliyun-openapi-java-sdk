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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBInitializeVariableResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBInitializeVariableResponse.Variable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInitializeVariableResponseUnmarshaller {

	public static DescribeDBInitializeVariableResponse unmarshall(DescribeDBInitializeVariableResponse describeDBInitializeVariableResponse, UnmarshallerContext _ctx) {
		
		describeDBInitializeVariableResponse.setRequestId(_ctx.stringValue("DescribeDBInitializeVariableResponse.RequestId"));
		describeDBInitializeVariableResponse.setDBType(_ctx.stringValue("DescribeDBInitializeVariableResponse.DBType"));
		describeDBInitializeVariableResponse.setDBVersion(_ctx.stringValue("DescribeDBInitializeVariableResponse.DBVersion"));

		List<Variable> variables = new ArrayList<Variable>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInitializeVariableResponse.Variables.Length"); i++) {
			Variable variable = new Variable();
			variable.setCharset(_ctx.stringValue("DescribeDBInitializeVariableResponse.Variables["+ i +"].Charset"));
			variable.setCollate(_ctx.stringValue("DescribeDBInitializeVariableResponse.Variables["+ i +"].Collate"));
			variable.setCtype(_ctx.stringValue("DescribeDBInitializeVariableResponse.Variables["+ i +"].Ctype"));

			variables.add(variable);
		}
		describeDBInitializeVariableResponse.setVariables(variables);
	 
	 	return describeDBInitializeVariableResponse;
	}
}