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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeEsExecuteDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeEsExecuteDataResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEsExecuteDataResponseUnmarshaller {

	public static DescribeEsExecuteDataResponse unmarshall(DescribeEsExecuteDataResponse describeEsExecuteDataResponse, UnmarshallerContext _ctx) {
		
		describeEsExecuteDataResponse.setRequestId(_ctx.stringValue("DescribeEsExecuteDataResponse.RequestId"));

		List<Content> contents = new ArrayList<Content>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEsExecuteDataResponse.Contents.Length"); i++) {
			Content content = new Content();
			content.setName(_ctx.stringValue("DescribeEsExecuteDataResponse.Contents["+ i +"].Name"));

			List<String> columns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEsExecuteDataResponse.Contents["+ i +"].Columns.Length"); j++) {
				columns.add(_ctx.stringValue("DescribeEsExecuteDataResponse.Contents["+ i +"].Columns["+ j +"]"));
			}
			content.setColumns(columns);

			List<String> points = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEsExecuteDataResponse.Contents["+ i +"].Points.Length"); j++) {
				points.add(_ctx.stringValue("DescribeEsExecuteDataResponse.Contents["+ i +"].Points["+ j +"]"));
			}
			content.setPoints(points);

			contents.add(content);
		}
		describeEsExecuteDataResponse.setContents(contents);
	 
	 	return describeEsExecuteDataResponse;
	}
}