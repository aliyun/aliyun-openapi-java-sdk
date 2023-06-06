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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningDetailResponse.CheckDetailColumn;
import com.aliyuncs.sas.model.v20181203.DescribeCheckWarningDetailResponse.CheckDetailColumn.Grid;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckWarningDetailResponseUnmarshaller {

	public static DescribeCheckWarningDetailResponse unmarshall(DescribeCheckWarningDetailResponse describeCheckWarningDetailResponse, UnmarshallerContext _ctx) {
		
		describeCheckWarningDetailResponse.setRequestId(_ctx.stringValue("DescribeCheckWarningDetailResponse.RequestId"));
		describeCheckWarningDetailResponse.setAdvice(_ctx.stringValue("DescribeCheckWarningDetailResponse.Advice"));
		describeCheckWarningDetailResponse.setType(_ctx.stringValue("DescribeCheckWarningDetailResponse.Type"));
		describeCheckWarningDetailResponse.setDescription(_ctx.stringValue("DescribeCheckWarningDetailResponse.Description"));
		describeCheckWarningDetailResponse.setItem(_ctx.stringValue("DescribeCheckWarningDetailResponse.Item"));
		describeCheckWarningDetailResponse.setCheckId(_ctx.longValue("DescribeCheckWarningDetailResponse.CheckId"));
		describeCheckWarningDetailResponse.setLevel(_ctx.stringValue("DescribeCheckWarningDetailResponse.Level"));
		describeCheckWarningDetailResponse.setPrompt(_ctx.stringValue("DescribeCheckWarningDetailResponse.Prompt"));

		List<Map<Object, Object>> checkDetailAssetInfo = _ctx.listMapValue("DescribeCheckWarningDetailResponse.CheckDetailAssetInfo");
		describeCheckWarningDetailResponse.setCheckDetailAssetInfo(checkDetailAssetInfo);

		List<CheckDetailColumn> checkDetailColumns = new ArrayList<CheckDetailColumn>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCheckWarningDetailResponse.CheckDetailColumns.Length"); i++) {
			CheckDetailColumn checkDetailColumn = new CheckDetailColumn();
			checkDetailColumn.setType(_ctx.stringValue("DescribeCheckWarningDetailResponse.CheckDetailColumns["+ i +"].Type"));
			checkDetailColumn.setKey(_ctx.stringValue("DescribeCheckWarningDetailResponse.CheckDetailColumns["+ i +"].Key"));
			checkDetailColumn.setShowName(_ctx.stringValue("DescribeCheckWarningDetailResponse.CheckDetailColumns["+ i +"].ShowName"));

			List<Grid> grids = new ArrayList<Grid>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCheckWarningDetailResponse.CheckDetailColumns["+ i +"].Grids.Length"); j++) {
				Grid grid = new Grid();
				grid.setType(_ctx.stringValue("DescribeCheckWarningDetailResponse.CheckDetailColumns["+ i +"].Grids["+ j +"].Type"));
				grid.setKey(_ctx.stringValue("DescribeCheckWarningDetailResponse.CheckDetailColumns["+ i +"].Grids["+ j +"].Key"));
				grid.setShowName(_ctx.stringValue("DescribeCheckWarningDetailResponse.CheckDetailColumns["+ i +"].Grids["+ j +"].ShowName"));

				grids.add(grid);
			}
			checkDetailColumn.setGrids(grids);

			checkDetailColumns.add(checkDetailColumn);
		}
		describeCheckWarningDetailResponse.setCheckDetailColumns(checkDetailColumns);
	 
	 	return describeCheckWarningDetailResponse;
	}
}