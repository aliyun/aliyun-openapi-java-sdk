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

import com.aliyuncs.sas.model.v20181203.DescribeExcludeSystemPathResponse;
import com.aliyuncs.sas.model.v20181203.DescribeExcludeSystemPathResponse.BaseModelDTO;
import com.aliyuncs.sas.model.v20181203.DescribeExcludeSystemPathResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExcludeSystemPathResponseUnmarshaller {

	public static DescribeExcludeSystemPathResponse unmarshall(DescribeExcludeSystemPathResponse describeExcludeSystemPathResponse, UnmarshallerContext _ctx) {
		
		describeExcludeSystemPathResponse.setRequestId(_ctx.stringValue("DescribeExcludeSystemPathResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeExcludeSystemPathResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeExcludeSystemPathResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeExcludeSystemPathResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeExcludeSystemPathResponse.PageInfo.CurrentPage"));
		describeExcludeSystemPathResponse.setPageInfo(pageInfo);

		List<BaseModelDTO> excludePaths = new ArrayList<BaseModelDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExcludeSystemPathResponse.ExcludePaths.Length"); i++) {
			BaseModelDTO baseModelDTO = new BaseModelDTO();
			baseModelDTO.setId(_ctx.longValue("DescribeExcludeSystemPathResponse.ExcludePaths["+ i +"].Id"));
			baseModelDTO.setOs(_ctx.stringValue("DescribeExcludeSystemPathResponse.ExcludePaths["+ i +"].Os"));
			baseModelDTO.setPath(_ctx.stringValue("DescribeExcludeSystemPathResponse.ExcludePaths["+ i +"].Path"));

			excludePaths.add(baseModelDTO);
		}
		describeExcludeSystemPathResponse.setExcludePaths(excludePaths);
	 
	 	return describeExcludeSystemPathResponse;
	}
}