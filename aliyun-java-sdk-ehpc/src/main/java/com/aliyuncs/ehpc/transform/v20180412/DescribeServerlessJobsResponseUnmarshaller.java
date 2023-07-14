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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ArrayProperties;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.CurrentState;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.EnvironmentVar;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.EnvironmentVar.ValueFrom;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.EnvironmentVar.ValueFrom.FieldRef;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.LivenessProbe;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.LivenessProbe.HttpGet;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.LivenessProbe.TcpSocket;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.Port;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.PreviousState;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.ReadinessProbe;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.ReadinessProbe.HttpGet2;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.ReadinessProbe.TcpSocket3;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.SecurityContext;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.SecurityContext.Capability;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Container.VolumeMount;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.DnsConfig;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.DnsConfig.Option;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.EciSecurityContext;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.EciSecurityContext.Sysctl;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Event;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.HostAlias;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.CurrentState5;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.EnvironmentVar11;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.EnvironmentVar11.ValueFrom12;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.EnvironmentVar11.ValueFrom12.FieldRef13;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.Port14;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.PreviousState6;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.SecurityContext7;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.SecurityContext7.Capability16;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.InitContainer.VolumeMount15;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Tag;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Volume;
import com.aliyuncs.ehpc.model.v20180412.DescribeServerlessJobsResponse.JobInfo.ContainerGroup.Volume.ConfigFileVolumeConfigFileToPath;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServerlessJobsResponseUnmarshaller {

	public static DescribeServerlessJobsResponse unmarshall(DescribeServerlessJobsResponse describeServerlessJobsResponse, UnmarshallerContext _ctx) {
		
		describeServerlessJobsResponse.setRequestId(_ctx.stringValue("DescribeServerlessJobsResponse.RequestId"));
		describeServerlessJobsResponse.setTotalCount(_ctx.integerValue("DescribeServerlessJobsResponse.TotalCount"));

		List<JobInfo> jobInfos = new ArrayList<JobInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setEndTime(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].EndTime"));
			jobInfo.setId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].Id"));
			jobInfo.setIsArrayJob(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].IsArrayJob"));
			jobInfo.setLastModifyTime(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].LastModifyTime"));
			jobInfo.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].Name"));
			jobInfo.setOwner(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].Owner"));
			jobInfo.setPriority(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].Priority"));
			jobInfo.setQueue(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].Queue"));
			jobInfo.setStartTime(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].StartTime"));
			jobInfo.setState(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].State"));
			jobInfo.setSubmitTime(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].SubmitTime"));

			ArrayProperties arrayProperties = new ArrayProperties();
			arrayProperties.setIndexStart(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ArrayProperties.IndexStart"));
			arrayProperties.setIndexEnd(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ArrayProperties.IndexEnd"));
			arrayProperties.setIndexStep(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ArrayProperties.IndexStep"));
			jobInfo.setArrayProperties(arrayProperties);

			List<ContainerGroup> containerGroups = new ArrayList<ContainerGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups.Length"); j++) {
				ContainerGroup containerGroup = new ContainerGroup();
				containerGroup.setContainerGroupId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].ContainerGroupId"));
				containerGroup.setContainerGroupName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].ContainerGroupName"));
				containerGroup.setCpu(_ctx.floatValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Cpu"));
				containerGroup.setCreationTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].CreationTime"));
				containerGroup.setDiscount(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Discount"));
				containerGroup.setEniInstanceId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].EniInstanceId"));
				containerGroup.setEphemeralStorage(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].EphemeralStorage"));
				containerGroup.setExpiredTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].ExpiredTime"));
				containerGroup.setFailedTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].FailedTime"));
				containerGroup.setInstanceType(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InstanceType"));
				containerGroup.setInternetIp(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InternetIp"));
				containerGroup.setIntranetIp(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].IntranetIp"));
				containerGroup.setIpv6Address(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Ipv6Address"));
				containerGroup.setMemory(_ctx.floatValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Memory"));
				containerGroup.setRamRoleName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].RamRoleName"));
				containerGroup.setRegionId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].RegionId"));
				containerGroup.setResourceGroupId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].ResourceGroupId"));
				containerGroup.setRestartPolicy(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].RestartPolicy"));
				containerGroup.setSecurityGroupId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].SecurityGroupId"));
				containerGroup.setSpotPriceLimit(_ctx.floatValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].SpotPriceLimit"));
				containerGroup.setSpotStrategy(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].SpotStrategy"));
				containerGroup.setStatus(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Status"));
				containerGroup.setSucceededTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].SucceededTime"));
				containerGroup.setTenantEniInstanceId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].TenantEniInstanceId"));
				containerGroup.setTenantEniIp(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].TenantEniIp"));
				containerGroup.setTenantSecurityGroupId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].TenantSecurityGroupId"));
				containerGroup.setTenantVSwitchId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].TenantVSwitchId"));
				containerGroup.setVSwitchId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].VSwitchId"));
				containerGroup.setVpcId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].VpcId"));
				containerGroup.setZoneId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].ZoneId"));

				DnsConfig dnsConfig = new DnsConfig();

				List<String> nameServers = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].DnsConfig.NameServers.Length"); k++) {
					nameServers.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].DnsConfig.NameServers["+ k +"]"));
				}
				dnsConfig.setNameServers(nameServers);

				List<String> searches = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].DnsConfig.Searches.Length"); k++) {
					searches.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].DnsConfig.Searches["+ k +"]"));
				}
				dnsConfig.setSearches(searches);

				List<Option> options = new ArrayList<Option>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].DnsConfig.Options.Length"); k++) {
					Option option = new Option();
					option.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].DnsConfig.Options["+ k +"].Name"));
					option.setValue(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].DnsConfig.Options["+ k +"].Value"));

					options.add(option);
				}
				dnsConfig.setOptions(options);
				containerGroup.setDnsConfig(dnsConfig);

				EciSecurityContext eciSecurityContext = new EciSecurityContext();

				List<Sysctl> sysctls = new ArrayList<Sysctl>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].EciSecurityContext.Sysctls.Length"); k++) {
					Sysctl sysctl = new Sysctl();
					sysctl.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].EciSecurityContext.Sysctls["+ k +"].Name"));
					sysctl.setValue(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].EciSecurityContext.Sysctls["+ k +"].Value"));

					sysctls.add(sysctl);
				}
				eciSecurityContext.setSysctls(sysctls);
				containerGroup.setEciSecurityContext(eciSecurityContext);

				List<Container> containers = new ArrayList<Container>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers.Length"); k++) {
					Container container = new Container();
					container.setCpu(_ctx.floatValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Cpu"));
					container.setGpu(_ctx.integerValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Gpu"));
					container.setImage(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Image"));
					container.setImagePullPolicy(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ImagePullPolicy"));
					container.setMemory(_ctx.floatValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Memory"));
					container.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Name"));
					container.setReady(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Ready"));
					container.setRestartCount(_ctx.integerValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].RestartCount"));
					container.setStdin(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Stdin"));
					container.setStdinOnce(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].StdinOnce"));
					container.setTty(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Tty"));
					container.setWorkingDir(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].WorkingDir"));

					List<String> args = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Args.Length"); l++) {
						args.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Args["+ l +"]"));
					}
					container.setArgs(args);

					List<String> commands = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Commands.Length"); l++) {
						commands.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Commands["+ l +"]"));
					}
					container.setCommands(commands);

					CurrentState currentState = new CurrentState();
					currentState.setDetailStatus(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.DetailStatus"));
					currentState.setExitCode(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.ExitCode"));
					currentState.setFinishTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.FinishTime"));
					currentState.setMessage(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.Message"));
					currentState.setReason(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.Reason"));
					currentState.setSignal(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.Signal"));
					currentState.setStartTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.StartTime"));
					currentState.setState(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].CurrentState.State"));
					container.setCurrentState(currentState);

					LivenessProbe livenessProbe = new LivenessProbe();
					livenessProbe.setFailureThreshold(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.FailureThreshold"));
					livenessProbe.setInitialDelaySeconds(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.InitialDelaySeconds"));
					livenessProbe.setPeriodSeconds(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.PeriodSeconds"));
					livenessProbe.setSuccessThreshold(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.SuccessThreshold"));
					livenessProbe.setTimeoutSeconds(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.TimeoutSeconds"));

					List<String> execs = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.Execs.Length"); l++) {
						execs.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.Execs["+ l +"]"));
					}
					livenessProbe.setExecs(execs);

					HttpGet httpGet = new HttpGet();
					httpGet.setPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.HttpGet.Path"));
					httpGet.setPort(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.HttpGet.Port"));
					httpGet.setScheme(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.HttpGet.Scheme"));
					livenessProbe.setHttpGet(httpGet);

					TcpSocket tcpSocket = new TcpSocket();
					tcpSocket.setHost(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.TcpSocket.Host"));
					tcpSocket.setPort(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].LivenessProbe.TcpSocket.Port"));
					livenessProbe.setTcpSocket(tcpSocket);
					container.setLivenessProbe(livenessProbe);

					PreviousState previousState = new PreviousState();
					previousState.setDetailStatus(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.DetailStatus"));
					previousState.setExitCode(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.ExitCode"));
					previousState.setFinishTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.FinishTime"));
					previousState.setMessage(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.Message"));
					previousState.setReason(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.Reason"));
					previousState.setSignal(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.Signal"));
					previousState.setStartTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.StartTime"));
					previousState.setState(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].PreviousState.State"));
					container.setPreviousState(previousState);

					ReadinessProbe readinessProbe = new ReadinessProbe();
					readinessProbe.setFailureThreshold(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.FailureThreshold"));
					readinessProbe.setInitialDelaySeconds(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.InitialDelaySeconds"));
					readinessProbe.setPeriodSeconds(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.PeriodSeconds"));
					readinessProbe.setSuccessThreshold(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.SuccessThreshold"));
					readinessProbe.setTimeoutSeconds(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.TimeoutSeconds"));

					List<String> execs1 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.Execs.Length"); l++) {
						execs1.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.Execs["+ l +"]"));
					}
					readinessProbe.setExecs1(execs1);

					HttpGet2 httpGet2 = new HttpGet2();
					httpGet2.setPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.HttpGet.Path"));
					httpGet2.setPort(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.HttpGet.Port"));
					httpGet2.setScheme(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.HttpGet.Scheme"));
					readinessProbe.setHttpGet2(httpGet2);

					TcpSocket3 tcpSocket3 = new TcpSocket3();
					tcpSocket3.setHost(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.TcpSocket.Host"));
					tcpSocket3.setPort(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].ReadinessProbe.TcpSocket.Port"));
					readinessProbe.setTcpSocket3(tcpSocket3);
					container.setReadinessProbe(readinessProbe);

					SecurityContext securityContext = new SecurityContext();
					securityContext.setReadOnlyRootFilesystem(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].SecurityContext.ReadOnlyRootFilesystem"));
					securityContext.setRunAsUser(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].SecurityContext.RunAsUser"));

					Capability capability = new Capability();

					List<String> adds = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].SecurityContext.Capability.Adds.Length"); l++) {
						adds.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].SecurityContext.Capability.Adds["+ l +"]"));
					}
					capability.setAdds(adds);
					securityContext.setCapability(capability);
					container.setSecurityContext(securityContext);

					List<EnvironmentVar> environmentVars = new ArrayList<EnvironmentVar>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].EnvironmentVars.Length"); l++) {
						EnvironmentVar environmentVar = new EnvironmentVar();
						environmentVar.setKey(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].EnvironmentVars["+ l +"].Key"));
						environmentVar.setValue(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].EnvironmentVars["+ l +"].Value"));

						ValueFrom valueFrom = new ValueFrom();

						FieldRef fieldRef = new FieldRef();
						fieldRef.setFieldPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].EnvironmentVars["+ l +"].ValueFrom.FieldRef.FieldPath"));
						valueFrom.setFieldRef(fieldRef);
						environmentVar.setValueFrom(valueFrom);

						environmentVars.add(environmentVar);
					}
					container.setEnvironmentVars(environmentVars);

					List<Port> ports = new ArrayList<Port>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Ports.Length"); l++) {
						Port port = new Port();
						port.setPort(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Ports["+ l +"].Port"));
						port.setBizProtocol(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].Ports["+ l +"].Protocol"));

						ports.add(port);
					}
					container.setPorts(ports);

					List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].VolumeMounts.Length"); l++) {
						VolumeMount volumeMount = new VolumeMount();
						volumeMount.setMountPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].VolumeMounts["+ l +"].MountPath"));
						volumeMount.setMountPropagation(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].VolumeMounts["+ l +"].MountPropagation"));
						volumeMount.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].VolumeMounts["+ l +"].Name"));
						volumeMount.setReadOnly(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].VolumeMounts["+ l +"].ReadOnly"));
						volumeMount.setSubPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Containers["+ k +"].VolumeMounts["+ l +"].SubPath"));

						volumeMounts.add(volumeMount);
					}
					container.setVolumeMounts(volumeMounts);

					containers.add(container);
				}
				containerGroup.setContainers(containers);

				List<Event> events = new ArrayList<Event>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events.Length"); k++) {
					Event event = new Event();
					event.setCount(_ctx.integerValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events["+ k +"].Count"));
					event.setFirstTimestamp(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events["+ k +"].FirstTimestamp"));
					event.setLastTimestamp(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events["+ k +"].LastTimestamp"));
					event.setMessage(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events["+ k +"].Message"));
					event.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events["+ k +"].Name"));
					event.setReason(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events["+ k +"].Reason"));
					event.setType(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Events["+ k +"].Type"));

					events.add(event);
				}
				containerGroup.setEvents(events);

				List<HostAlias> hostAliases = new ArrayList<HostAlias>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].HostAliases.Length"); k++) {
					HostAlias hostAlias = new HostAlias();
					hostAlias.setIp(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].HostAliases["+ k +"].Ip"));

					List<String> hostnames = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].HostAliases["+ k +"].Hostnames.Length"); l++) {
						hostnames.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].HostAliases["+ k +"].Hostnames["+ l +"]"));
					}
					hostAlias.setHostnames(hostnames);

					hostAliases.add(hostAlias);
				}
				containerGroup.setHostAliases(hostAliases);

				List<InitContainer> initContainers = new ArrayList<InitContainer>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers.Length"); k++) {
					InitContainer initContainer = new InitContainer();
					initContainer.setCpu(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Cpu"));
					initContainer.setGpu(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Gpu"));
					initContainer.setImage(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Image"));
					initContainer.setImagePullPolicy(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].ImagePullPolicy"));
					initContainer.setMemory(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Memory"));
					initContainer.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Name"));
					initContainer.setReady(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Ready"));
					initContainer.setRestartCount(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].RestartCount"));
					initContainer.setWorkingDir(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].WorkingDir"));

					List<String> args4 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Args.Length"); l++) {
						args4.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Args["+ l +"]"));
					}
					initContainer.setArgs4(args4);

					List<String> command = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Command.Length"); l++) {
						command.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Command["+ l +"]"));
					}
					initContainer.setCommand(command);

					CurrentState5 currentState5 = new CurrentState5();
					currentState5.setDetailStatus(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.DetailStatus"));
					currentState5.setExitCode(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.ExitCode"));
					currentState5.setFinishTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.FinishTime"));
					currentState5.setMessage(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.Message"));
					currentState5.setReason(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.Reason"));
					currentState5.setSignal(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.Signal"));
					currentState5.setStartTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.StartTime"));
					currentState5.setState(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].CurrentState.State"));
					initContainer.setCurrentState5(currentState5);

					PreviousState6 previousState6 = new PreviousState6();
					previousState6.setDetailStatus(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.DetailStatus"));
					previousState6.setExitCode(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.ExitCode"));
					previousState6.setFinishTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.FinishTime"));
					previousState6.setMessage(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.Message"));
					previousState6.setReason(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.Reason"));
					previousState6.setSignal(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.Signal"));
					previousState6.setStartTime(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.StartTime"));
					previousState6.setState(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].PreviousState.State"));
					initContainer.setPreviousState6(previousState6);

					SecurityContext7 securityContext7 = new SecurityContext7();
					securityContext7.setReadOnlyRootFilesystem(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].SecurityContext.ReadOnlyRootFilesystem"));
					securityContext7.setRunAsUser(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].SecurityContext.RunAsUser"));

					Capability16 capability16 = new Capability16();

					List<String> adds17 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].SecurityContext.Capability.Adds.Length"); l++) {
						adds17.add(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].SecurityContext.Capability.Adds["+ l +"]"));
					}
					capability16.setAdds17(adds17);
					securityContext7.setCapability16(capability16);
					initContainer.setSecurityContext7(securityContext7);

					List<EnvironmentVar11> environmentVars8 = new ArrayList<EnvironmentVar11>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].EnvironmentVars.Length"); l++) {
						EnvironmentVar11 environmentVar11 = new EnvironmentVar11();
						environmentVar11.setKey(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].EnvironmentVars["+ l +"].Key"));
						environmentVar11.setValue(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].EnvironmentVars["+ l +"].Value"));

						ValueFrom12 valueFrom12 = new ValueFrom12();

						FieldRef13 fieldRef13 = new FieldRef13();
						fieldRef13.setFieldPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].EnvironmentVars["+ l +"].ValueFrom.FieldRef.FieldPath"));
						valueFrom12.setFieldRef13(fieldRef13);
						environmentVar11.setValueFrom12(valueFrom12);

						environmentVars8.add(environmentVar11);
					}
					initContainer.setEnvironmentVars8(environmentVars8);

					List<Port14> ports9 = new ArrayList<Port14>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Ports.Length"); l++) {
						Port14 port14 = new Port14();
						port14.setPort(_ctx.longValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Ports["+ l +"].Port"));
						port14.setBizProtocol(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].Ports["+ l +"].Protocol"));

						ports9.add(port14);
					}
					initContainer.setPorts9(ports9);

					List<VolumeMount15> volumeMounts10 = new ArrayList<VolumeMount15>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].VolumeMounts.Length"); l++) {
						VolumeMount15 volumeMount15 = new VolumeMount15();
						volumeMount15.setMountPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].VolumeMounts["+ l +"].MountPath"));
						volumeMount15.setMountPropagation(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].VolumeMounts["+ l +"].MountPropagation"));
						volumeMount15.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].VolumeMounts["+ l +"].Name"));
						volumeMount15.setReadOnly(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].InitContainers["+ k +"].VolumeMounts["+ l +"].ReadOnly"));

						volumeMounts10.add(volumeMount15);
					}
					initContainer.setVolumeMounts10(volumeMounts10);

					initContainers.add(initContainer);
				}
				containerGroup.setInitContainers(initContainers);

				List<Tag> tags = new ArrayList<Tag>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Tags.Length"); k++) {
					Tag tag = new Tag();
					tag.setKey(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Tags["+ k +"].Key"));
					tag.setValue(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Tags["+ k +"].Value"));

					tags.add(tag);
				}
				containerGroup.setTags(tags);

				List<Volume> volumes = new ArrayList<Volume>();
				for (int k = 0; k < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes.Length"); k++) {
					Volume volume = new Volume();
					volume.setDiskVolumeDiskId(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].DiskVolumeDiskId"));
					volume.setDiskVolumeFsType(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].DiskVolumeFsType"));
					volume.setEmptyDirVolumeMedium(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].EmptyDirVolumeMedium"));
					volume.setEmptyDirVolumeSizeLimit(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].EmptyDirVolumeSizeLimit"));
					volume.setFlexVolumeDriver(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].FlexVolumeDriver"));
					volume.setFlexVolumeFsType(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].FlexVolumeFsType"));
					volume.setFlexVolumeOptions(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].FlexVolumeOptions"));
					volume.setNFSVolumePath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].NFSVolumePath"));
					volume.setNFSVolumeReadOnly(_ctx.booleanValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].NFSVolumeReadOnly"));
					volume.setNFSVolumeServer(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].NFSVolumeServer"));
					volume.setName(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].Name"));
					volume.setType(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].Type"));

					List<ConfigFileVolumeConfigFileToPath> configFileVolumeConfigFileToPaths = new ArrayList<ConfigFileVolumeConfigFileToPath>();
					for (int l = 0; l < _ctx.lengthValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].ConfigFileVolumeConfigFileToPaths.Length"); l++) {
						ConfigFileVolumeConfigFileToPath configFileVolumeConfigFileToPath = new ConfigFileVolumeConfigFileToPath();
						configFileVolumeConfigFileToPath.setContent(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].ConfigFileVolumeConfigFileToPaths["+ l +"].Content"));
						configFileVolumeConfigFileToPath.setPath(_ctx.stringValue("DescribeServerlessJobsResponse.JobInfos["+ i +"].ContainerGroups["+ j +"].Volumes["+ k +"].ConfigFileVolumeConfigFileToPaths["+ l +"].Path"));

						configFileVolumeConfigFileToPaths.add(configFileVolumeConfigFileToPath);
					}
					volume.setConfigFileVolumeConfigFileToPaths(configFileVolumeConfigFileToPaths);

					volumes.add(volume);
				}
				containerGroup.setVolumes(volumes);

				containerGroups.add(containerGroup);
			}
			jobInfo.setContainerGroups(containerGroups);

			jobInfos.add(jobInfo);
		}
		describeServerlessJobsResponse.setJobInfos(jobInfos);
	 
	 	return describeServerlessJobsResponse;
	}
}