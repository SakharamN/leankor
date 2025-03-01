package helper_package;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator;
import pom_package.CreateMilestoneAndAutomateThreedotfunctionalityOnPgLocator;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;

public class CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper extends CommonMethodsOfWebDriver

{

	public static String createFolderNameRandomly, createProjectNameRandomly, ActivityStartDateWhileCreating,
			getIframeWindowNameAttributeValue, handlevaluefokanbanBoardwindow, kanbanBoardwindowhandless;
	public static int sizeofSchedulemodeonactivity, sizeOfElementOnPG;
	public static String getIframeSRCAttribute, childIframevalue, textAreaIDAttribute,
			classAttributeValueOfQuickActionSideColumn;

	public void singleMilestone() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String newTabTitle = driver.getTitle();
		System.out.println("New title of the tab is: " + newTabTitle);
		// wait.until(ExpectedConditions.titleIs(newTabTitle));

		wait.until(ExpectedConditions.titleIs("Leankor | Salesforce"));

		try {
			Thread.sleep(8000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()).click();

		// wait.until(ExpectedConditions.presenceOfElementLocated(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()));

		// try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		// findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()).click();

		createFolderNameRandomly = generateRandomString(6);
		System.out.println(
				"folder name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg class:: "
						+ createFolderNameRandomly);

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterFolderName())
				.sendKeys("A " + createFolderNameRandomly);
		explicitWaitElementToBeClickable(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		scrollinToView(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));
		explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));
		jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(
				findElement(CreateMilestoneAndAutomateThreedotfunctionalityOnPgLocator.clickOnThreeDot()));
		findElement(CreateMilestoneAndAutomateThreedotfunctionalityOnPgLocator.clickOnThreeDot()).click();

		createProjectNameRandomly = generateRandomString(5);
		System.out.println(
				"Project name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg ::"
						+ createProjectNameRandomly);

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName())
				.sendKeys(createProjectNameRandomly);

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitVisibilityOf(
				findElement(CreateMilestoneAndAutomateThreedotfunctionalityOnPgLocator.clickOnCreatedProject()));
		findElement(CreateMilestoneAndAutomateThreedotfunctionalityOnPgLocator.clickOnCreatedProject()).click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.Customloadspinner()));

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()));
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()));
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		// explicitWaitElementBy("elementToBeLocated",
		// CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addActivity());
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addActivity()).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		int sizeOfElementOnPG = driver
				.findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.AddNewActivityButton())
				.size();
		System.out.println("Number of elements of sizeof elements :" + sizeOfElementOnPG);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.AddNewActivityButton())
				.get(sizeOfElementOnPG - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		// findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("milestone1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

	public void quickActionsOnMilstone() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// **************************Check Condition for Quick Action button is active
		// or inactive on milestone side Column**************************

		explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
				.quickActionCheckConditionOnMilestone());
		classAttributeValueOfQuickActionSideColumn = findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.quickActionCheckConditionOnMilestone())
						.getDomAttribute("class");
		System.out.println(
				"Class attribute value of quick action side column  :" + classAttributeValueOfQuickActionSideColumn);

		// Class attribute is x-menu-item-link means Quick Action icon is visible and
		// click on it

		if (classAttributeValueOfQuickActionSideColumn.equals("x-menu-item-link")) {
			System.out.println("Quick Action button is active and perform change date operation.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}

			explicitWaitElementBy("elementToBeLocated",
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickQuickActionsOnMilestone());
			findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickQuickActionsOnMilestone())
					.click();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
			explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
					.clickOnChangeDatequickActionsOnActivity());
			findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
					.clickOnChangeDatequickActionsOnActivity()).click();

			try {
				Thread.sleep(6000);
			} catch (InterruptedException ie) {
			}

			driver.switchTo().frame(findElement(
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iframeOnQuickActions()));

			boolean isChangeDateQuickActionWindowVisible = findElement(
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.isChangeDateWindowVisible())
							.isDisplayed();
			System.out.println("After click on change date quick action popup window opened :"
					+ isChangeDateQuickActionWindowVisible);

			if (isChangeDateQuickActionWindowVisible) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}

				explicitWaitElementBy("elementToBeLocated",
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
								.isStartDateCalendarVisibleUnderiFrame());
				boolean isStartDateFieldVisible = findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
								.isStartDateCalendarVisibleUnderiFrame()).isDisplayed();
				System.out.println("Start Date Field under iFrame is visible and now click on Due Date calendar."
						+ isStartDateFieldVisible);

				if (isStartDateFieldVisible) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ie) {
					}
					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.clickOnQuickActionDueDateCalendarField());
					findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
							.clickOnQuickActionDueDateCalendarField()).click();

					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.dueDateQuickActionCalendarAfterOnClick());
					boolean dueDateCalendarQuickAction = findElement(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.dueDateQuickActionCalendarAfterOnClick()).isDisplayed();
					System.out.println("dueDateCalendarQuickAction  :" + dueDateCalendarQuickAction);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
					}
					scrollDown();

					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
					}
					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar());
					String getSelectedDateFromQuickActionDueDateCalendar = findElement(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar()).getText();
					System.out.println("getSelectedDateFromQuickActionDueDateCalendar :"
							+ getSelectedDateFromQuickActionDueDateCalendar + " is selected date currently.");

					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar());
					String getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar = findElement(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getSelectedDateFromQuickActionDueDateCalendar()).getDomAttribute("aria-selected");
					System.out.println(
							"getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar under Quick action Due Date calendar :"
									+ getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar);

					explicitWaitElementBy("elementToBeLocated",
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getAllRowElementsOfSelectDate());
					int getSizeOfAllRowElementsOfSelectDate = findElements(
							CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.getAllRowElementsOfSelectDate()).size();
					System.out.println("getSizeOfAllRowElementsOfSelectDate under Quick action Due Date calendar :"
							+ getSizeOfAllRowElementsOfSelectDate);

					for (int i = 1; i <= getSizeOfAllRowElementsOfSelectDate; i++) {
						String classAttributeValueOfTdElement = findElement(
								By.xpath("//td[@aria-selected='true']/parent::tr/child::td[" + i + "]"))
										.getDomAttribute("aria-selected");
						System.out.println("classAttributeValueOfTdElement  after " + i + " iteration :"
								+ classAttributeValueOfTdElement);

						if (getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar
								.equals(classAttributeValueOfTdElement) && i <= 5) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ie) {
							}
							findElement(By.xpath("//td[@aria-selected='true']/parent::tr/child::td[" + (i + 2) + "]"))
									.click();
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ie) {
							}
							explicitWaitElementBy("elementToBeLocated",
									CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
											.clickOnSaveButtonAfterDateSelectedOnQuickAction());
							findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
							break;
						} else if (getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar
								.equals(classAttributeValueOfTdElement) && i >= 6) {
							try {
								Thread.sleep(1500);
							} catch (InterruptedException ie) {
							}
							explicitWaitElementBy("elementToBeLocated",
									CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
											.selectDateFromQuickActionCalendarOnNextRow());
							findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.selectDateFromQuickActionCalendarOnNextRow()).click();
							try {
								Thread.sleep(2000);
							} catch (InterruptedException ie) {
							}
							explicitWaitElementBy("elementToBeLocated",
									CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
											.clickOnSaveButtonAfterDateSelectedOnQuickAction());
							findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
									.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
							break;
						}
					}
				}
			}
		}

		else

		{
			// perform random click on Plan Gantt Board

			/*
			 * try { robot = new Robot(); } catch(AWTException awtExc) {}
			 * 
			 * try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			 * robot.mouseMove(500, 500); actions.click().build().perform();
			 * 
			 */

			try {
				Thread.sleep(1500);
			} catch (InterruptedException ie) {
			}

			explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
			findElement(By.xpath("//body")).click();

		}
		System.out.println(
				"***********************************************************************************************************************************************************************************************************");

	}

	public void addButtonfunctionality() {

		// perform add button functionality on miletsone

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().parentFrame();

		// Add activity above

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone())
				.click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityAbove()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityAbove()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("ActivityAbove");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		// Add activity below

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone())
				.click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityBelow()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("ActivityBelow");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		// Add milestone

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone())
				.click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addMilestone()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("milestone1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		// Add activity group

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone())
				.click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButtonOnMilestone())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityGroup()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityGroup()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("ActivityGroup1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);
		System.out.println("We  performed add button functionality on Milestone :"
				+ "\n**************************************************************************************************************************************************************************************************");

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

	}

	public void discusstabOnmilestone() {
		explicitWaitElementBy("elementToBeLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.threedotOnMilestone());
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.threedotOnMilestone()).click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumnonmilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumnonmilestone())
				.click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.loadMaskCountForKanbanBoard());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe());

		getIframeSRCAttribute = findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe())
						.getDomAttribute("src");
		System.out.println("src :" + getIframeSRCAttribute);

		driver.switchTo().frame(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iFrameSrcValueAndSwitchToframeMile()));

		handleElementClickInterceptedExpectionWhileClickOnElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnPostLink());

		boolean PostWindowclickElementvisible = findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnPostWriteSomething())
						.isDisplayed();
		System.out.println("PostClick element is displayed :" + PostWindowclickElementvisible);

		if (PostWindowclickElementvisible) {
			explicitWaitElementBy("elementToBeLocated",
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectchildirframe());
			childIframevalue = findElement(
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectchildirframe())
							.getDomAttribute("class");
			System.out.println("childIframe class attribute value :" + childIframevalue);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
			driver.switchTo().frame(findElement(
					CreateMilestoneAndAutomateThreedotfunctionalityOnPgLocator.getChildiFrameClassAttributeValue()));
			explicitWaitElementBy("elementToBeLocated",
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnchatterTextarea());
			findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnchatterTextarea())
					.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}

			boolean chatterArea = findElement(
					CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.writeOnChatterTextArea())
							.isDisplayed();
			System.out.println("chatter area is visible :" + chatterArea);

			if (chatterArea) {
				explicitWaitVisibilityOf(findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.writeOnChatterTextArea()));
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.writeOnChatterTextArea())
						.sendKeys("Hello this chatter on milestone on plan gantt Board");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}
				driver.switchTo().parentFrame();

				explicitWaitVisibilityOf(findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnshareButton()));
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.ClickOnshareButton())
						.click();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}
				explicitWaitElementBy("elementToBeLocated",
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.textDivArea());
				textAreaIDAttribute = findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.textDivArea())
								.getDomAttribute("id");
				System.out.println("Plan Gantt Board Chatter text Area ID Attribute  :" + textAreaIDAttribute);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException ie) {
				}

				explicitWaitElementBy("elementToBeLocated",
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
								.getTextFromChatterSubWindowofMilestone());
				String chatterText = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
						.getTextFromChatterSubWindowofMilestone()).getText();
				System.out.println("After Chatter get text from chatter sub window LINE :" + chatterText);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}

				// driver.switchTo().defaultContent();

				driver.switchTo().parentFrame();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}
				explicitWaitElementBy("elementToBeLocated",
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator
								.closeKanbanBoardChatterPopup());
				findElement(
						CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.closeKanbanBoardChatterPopup())
								.click();

			}

		}

	}

	public void convertToActivityGroup() {

		// converting milestone to activity group

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone())
				.click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivityformilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivityformilestone())
				.click();
		System.out.println("Milestone is Converted into Activity Group");

	}

	public void performIndentOutdentExternalDependancyCloneAndDeleteOperation() {

		// firstly click on activity below milestone

		// indent operation

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.savingChangesLoadmask());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// outdent operation

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.savingChangesLoadmask());

		// External dependancy

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		explicitWaitVisibilityOf(findElement(
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency())
				.click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException ie) {
		}

		// Set<String>windows = driver.getWindowHandles();

		ArrayList<String> alltabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(alltabs.get(0));

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}

		// milestone clone operation

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		// create new method for quick actions

		// explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnQuickActions()));
		// findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnQuickActions()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());

		// Delete operation

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deletingLoadmask());

	}

	public void convertTomilestone() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// convert to milestone

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();

		explicitWaitVisibilityOf(
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.converttomilestone()));
		findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.converttomilestone()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

	}

}