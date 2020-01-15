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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeCustomDataImportSrcDstTablesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeCustomDataImportSrcDstTablesResponse.DataImportSrcDstTables;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomDataImportSrcDstTablesResponseUnmarshaller {

	public static DescribeCustomDataImportSrcDstTablesResponse unmarshall(DescribeCustomDataImportSrcDstTablesResponse describeCustomDataImportSrcDstTablesResponse, UnmarshallerContext _ctx) {
		
		describeCustomDataImportSrcDstTablesResponse.setRequestId(_ctx.stringValue("DescribeCustomDataImportSrcDstTablesResponse.RequestId"));
		describeCustomDataImportSrcDstTablesResponse.setSuccess(_ctx.booleanValue("DescribeCustomDataImportSrcDstTablesResponse.Success"));

		DataImportSrcDstTables dataImportSrcDstTables = new DataImportSrcDstTables();

		List<String> srcTables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomDataImportSrcDstTablesResponse.DataImportSrcDstTables.SrcTables.Length"); i++) {
			srcTables.add(_ctx.stringValue("DescribeCustomDataImportSrcDstTablesResponse.DataImportSrcDstTables.SrcTables["+ i +"]"));
		}
		dataImportSrcDstTables.setSrcTables(srcTables);

		List<String> dstTables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomDataImportSrcDstTablesResponse.DataImportSrcDstTables.DstTables.Length"); i++) {
			dstTables.add(_ctx.stringValue("DescribeCustomDataImportSrcDstTablesResponse.DataImportSrcDstTables.DstTables["+ i +"]"));
		}
		dataImportSrcDstTables.setDstTables(dstTables);
		describeCustomDataImportSrcDstTablesResponse.setDataImportSrcDstTables(dataImportSrcDstTables);
	 
	 	return describeCustomDataImportSrcDstTablesResponse;
	}
}