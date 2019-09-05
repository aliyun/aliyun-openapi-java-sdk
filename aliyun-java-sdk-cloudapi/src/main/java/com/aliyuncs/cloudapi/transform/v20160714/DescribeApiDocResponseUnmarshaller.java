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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiDocResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiDocResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiDocResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiDocResponse.RequestParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiDocResponse.ResultDescription;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiDocResponseUnmarshaller {

	public static DescribeApiDocResponse unmarshall(DescribeApiDocResponse describeApiDocResponse, UnmarshallerContext _ctx) {
		
		describeApiDocResponse.setRequestId(_ctx.stringValue("DescribeApiDocResponse.RequestId"));
		describeApiDocResponse.setRegionId(_ctx.stringValue("DescribeApiDocResponse.RegionId"));
		describeApiDocResponse.setGroupId(_ctx.stringValue("DescribeApiDocResponse.GroupId"));
		describeApiDocResponse.setGroupName(_ctx.stringValue("DescribeApiDocResponse.GroupName"));
		describeApiDocResponse.setStageName(_ctx.stringValue("DescribeApiDocResponse.StageName"));
		describeApiDocResponse.setApiId(_ctx.stringValue("DescribeApiDocResponse.ApiId"));
		describeApiDocResponse.setApiName(_ctx.stringValue("DescribeApiDocResponse.ApiName"));
		describeApiDocResponse.setDescription(_ctx.stringValue("DescribeApiDocResponse.Description"));
		describeApiDocResponse.setVisibility(_ctx.stringValue("DescribeApiDocResponse.Visibility"));
		describeApiDocResponse.setAuthType(_ctx.stringValue("DescribeApiDocResponse.AuthType"));
		describeApiDocResponse.setResultType(_ctx.stringValue("DescribeApiDocResponse.ResultType"));
		describeApiDocResponse.setResultSample(_ctx.stringValue("DescribeApiDocResponse.ResultSample"));
		describeApiDocResponse.setFailResultSample(_ctx.stringValue("DescribeApiDocResponse.FailResultSample"));
		describeApiDocResponse.setDeployedTime(_ctx.stringValue("DescribeApiDocResponse.DeployedTime"));
		describeApiDocResponse.setForceNonceCheck(_ctx.booleanValue("DescribeApiDocResponse.ForceNonceCheck"));
		describeApiDocResponse.setDisableInternet(_ctx.booleanValue("DescribeApiDocResponse.DisableInternet"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(_ctx.stringValue("DescribeApiDocResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(_ctx.stringValue("DescribeApiDocResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(_ctx.stringValue("DescribeApiDocResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(_ctx.stringValue("DescribeApiDocResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(_ctx.stringValue("DescribeApiDocResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(_ctx.stringValue("DescribeApiDocResponse.RequestConfig.RequestMode"));
		describeApiDocResponse.setRequestConfig(requestConfig);

		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiDocResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(_ctx.stringValue("DescribeApiDocResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setMessage(_ctx.stringValue("DescribeApiDocResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(_ctx.stringValue("DescribeApiDocResponse.ErrorCodeSamples["+ i +"].Description"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeApiDocResponse.setErrorCodeSamples(errorCodeSamples);

		List<ResultDescription> resultDescriptions = new ArrayList<ResultDescription>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiDocResponse.ResultDescriptions.Length"); i++) {
			ResultDescription resultDescription = new ResultDescription();
			resultDescription.setId(_ctx.stringValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].Id"));
			resultDescription.setPid(_ctx.stringValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].Pid"));
			resultDescription.setHasChild(_ctx.booleanValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].HasChild"));
			resultDescription.setKey(_ctx.stringValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].Key"));
			resultDescription.setName(_ctx.stringValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].Name"));
			resultDescription.setMandatory(_ctx.booleanValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].Mandatory"));
			resultDescription.setType(_ctx.stringValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].Type"));
			resultDescription.setDescription(_ctx.stringValue("DescribeApiDocResponse.ResultDescriptions["+ i +"].Description"));

			resultDescriptions.add(resultDescription);
		}
		describeApiDocResponse.setResultDescriptions(resultDescriptions);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiDocResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(_ctx.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(_ctx.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(_ctx.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(_ctx.longValue("DescribeApiDocResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(_ctx.integerValue("DescribeApiDocResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(_ctx.stringValue("DescribeApiDocResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeApiDocResponse.setRequestParameters(requestParameters);
	 
	 	return describeApiDocResponse;
	}
}