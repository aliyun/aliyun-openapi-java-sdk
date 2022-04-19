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

import com.aliyuncs.sas.model.v20181203.DescribeLoginBaseConfigsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeLoginBaseConfigsResponse.BaseConfig;
import com.aliyuncs.sas.model.v20181203.DescribeLoginBaseConfigsResponse.BaseConfig.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoginBaseConfigsResponseUnmarshaller {

	public static DescribeLoginBaseConfigsResponse unmarshall(DescribeLoginBaseConfigsResponse describeLoginBaseConfigsResponse, UnmarshallerContext _ctx) {
		
		describeLoginBaseConfigsResponse.setRequestId(_ctx.stringValue("DescribeLoginBaseConfigsResponse.RequestId"));
		describeLoginBaseConfigsResponse.setCurrentPage(_ctx.integerValue("DescribeLoginBaseConfigsResponse.CurrentPage"));
		describeLoginBaseConfigsResponse.setPageSize(_ctx.integerValue("DescribeLoginBaseConfigsResponse.PageSize"));
		describeLoginBaseConfigsResponse.setTotalCount(_ctx.integerValue("DescribeLoginBaseConfigsResponse.TotalCount"));

		List<BaseConfig> baseConfigs = new ArrayList<BaseConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLoginBaseConfigsResponse.BaseConfigs.Length"); i++) {
			BaseConfig baseConfig = new BaseConfig();
			baseConfig.setEndTime(_ctx.stringValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].EndTime"));
			baseConfig.setAccount(_ctx.stringValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].Account"));
			baseConfig.setStartTime(_ctx.stringValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].StartTime"));
			baseConfig.setIp(_ctx.stringValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].Ip"));
			baseConfig.setTotalCount(_ctx.integerValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].TotalCount"));
			baseConfig.setUuidCount(_ctx.integerValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].UuidCount"));
			baseConfig.setLocation(_ctx.stringValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].Location"));

			List<Target> targetList = new ArrayList<Target>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].TargetList.Length"); j++) {
				Target target = new Target();
				target.setTarget(_ctx.stringValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].TargetList["+ j +"].Target"));
				target.setTargetType(_ctx.stringValue("DescribeLoginBaseConfigsResponse.BaseConfigs["+ i +"].TargetList["+ j +"].TargetType"));

				targetList.add(target);
			}
			baseConfig.setTargetList(targetList);

			baseConfigs.add(baseConfig);
		}
		describeLoginBaseConfigsResponse.setBaseConfigs(baseConfigs);
	 
	 	return describeLoginBaseConfigsResponse;
	}
}